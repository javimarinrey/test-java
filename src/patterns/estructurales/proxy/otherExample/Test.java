package patterns.estructurales.proxy.otherExample;

public class Test {


    public static void main(String[] args) {

        Calculadora calculadoraProxy = CalculadoraProxyFactory.proxyFactory(new CalculadoraImpl());

        Integer result = calculadoraProxy.suma(-1,2);
        System.out.println(result);

    }

}
