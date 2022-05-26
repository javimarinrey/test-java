package log4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Log4jManagerA {

    private static String file;
    private static Log4jManagerA instance;
    private Logger logger = Logger.getLogger(Log4jManagerA.class);


    public Log4jManagerA() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String yyyyMMdd = sdf.format(new Date());
        file = "/datos/logs/managerA_"+yyyyMMdd+".log";
        RollingFileAppender appender = new RollingFileAppender();
        appender.setAppend(true);
        appender.setFile(file);
        appender.setMaxFileSize("100MB");
        appender.setMaxBackupIndex(3);
        appender.activateOptions();
        PatternLayout layOut = new PatternLayout();
        layOut.setConversionPattern("%d{yyyy-MM-dd HH:mm:ss} - %m%n");
        appender.setLayout(layOut);
        logger.addAppender(appender);
        logger.setLevel(Level.DEBUG);
    }

    public static Log4jManagerA getInstance() {
        if (instance == null) {
            synchronized (Log4jManagerA.class) {
                if (instance == null) {
                    instance = new Log4jManagerA();
                }
            }
        }
        return instance;
    }

    public Logger getLogger() {
        return logger;
    }

    public void close() {
        logger.removeAllAppenders();
    }

    public static String getFile() {
        return file;
    }
}
