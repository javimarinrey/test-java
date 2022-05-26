package patterns.comportamiento.strategy;

public class Multiplicar implements IAritmetica {
    @Override
    public int realizarOperacion(int a, int b) {
        return a * b;
    }
}
