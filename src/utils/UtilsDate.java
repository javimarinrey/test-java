package utils;

import java.text.DecimalFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.IsoFields;
import java.time.temporal.TemporalAdjusters;

public class UtilsDate {

    public static String formatTime(long miliseconds) {
        int total_seconds = (int) miliseconds / 1000;
        int sec = total_seconds % 60;
        int min = (total_seconds / 60) % 60;
        int hours = (total_seconds / 60) / 60;
        return hours + "h:" + min + "m:" + sec + "s";
    }

    /**
     *
     * @param year
     * @param week
     * @param dayOfWeek { 1: MONDAY, ..., 7:SUNDAY }
     * @return
     */
    public static String getDateFromWeekYear(int year, int week, int dayOfWeek) {
        LocalDate localDate = LocalDate.ofYearDay(year, week)
                .with(IsoFields.WEEK_OF_WEEK_BASED_YEAR, week)
                .with(TemporalAdjusters.previousOrSame(DayOfWeek.of(dayOfWeek)));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return localDate.format(formatter);
    }

    /**
     * Obtener el Date de java.sql para insertar correctamente la fecha (tipo DATE) en Oracle
     * @return
     */
    public static java.sql.Date getCurrentDate() {
        java.util.Date today = new java.util.Date();
        return new java.sql.Date(today.getTime());
    }

    /**
     * Devuelve el tiempo (ms) en formato ms, seg o min
     * @param tiempo tiempo en ms
     * @return
     */
    public static String formatterDelay(long tiempo) {

        DecimalFormat df2 = new DecimalFormat(".##");

        if (tiempo < 1000) {
            return tiempo+"ms";
        } else {

            long seg = tiempo / 1000;
            if (seg < 60) {
                return df2.format(seg)+"seg";
            } else {
                long min = seg / 60;
                return df2.format(min)+"min";
            }

        }

    }

}
