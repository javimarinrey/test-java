package exceptions;

public class ExceptionBasic {



    public int getData (int valor) throws Exception {

        int result = 1;
        try {
            if (valor > 0) {
                result = valor / 0;
            } else {
                throw new Exception("El valor es menor de zero");
            }
        } catch (Exception e) {
            throw new Exception();
        } finally {
            System.out.println("Finally");
        }

        return result;

    }

}
