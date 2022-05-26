package patterns.comportamiento.strategy;

public class Restar implements IAritmetica {
    @Override
    public int realizarOperacion(int a, int b) {
        return a - b;
    }
}
