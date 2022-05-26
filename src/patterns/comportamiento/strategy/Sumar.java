package patterns.comportamiento.strategy;

public class Sumar implements IAritmetica {
    @Override
    public int realizarOperacion(int a, int b) {
        return a + b;
    }
}
