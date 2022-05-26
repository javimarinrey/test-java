package exceptions;

public class Main {

    public static void main(String[] args) {

        ExceptionBasic exceptionBasic = new ExceptionBasic();

        try {
            System.out.println(exceptionBasic.getData(0));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
