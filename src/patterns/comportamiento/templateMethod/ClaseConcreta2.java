package patterns.comportamiento.templateMethod;

public class ClaseConcreta2 extends ClaseAbstracta {
    @Override
    public int multiplicar(int num) {
        return num * 1000;
    }

    @Override
    public int sumar(int num) {
        return num + 100;
    }
}
