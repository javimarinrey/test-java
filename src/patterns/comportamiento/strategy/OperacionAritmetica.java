package patterns.comportamiento.strategy;

public class OperacionAritmetica {

    private IAritmetica strategy;

    public OperacionAritmetica(IAritmetica strategy) {
        this.strategy = strategy;
    }

    public int procesar(int a, int b) {
        return strategy.realizarOperacion(a, b);
    }
}
