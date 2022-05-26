package patterns.estructurales.proxy.otherExample;

public class CalculadoraImpl implements Calculadora {
    @Override
    public Integer suma(Integer a, Integer b) {
        return a + b;
    }
}
