package patterns.estructurales.proxy.otherExample;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalculadoraProxyFactory implements InvocationHandler {

    private final Calculadora target;

    public CalculadoraProxyFactory(Calculadora target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        for (Object object : args) {
            if (object instanceof Integer) {

                Integer number = Integer.valueOf(object.toString());
                if (number.intValue() > 0) {
                    System.out.println("Parameter [" + number + "]");
                } else {
                    System.out.println("Invalid number [" + number + "]");
                    throw new RuntimeException("Invalid number [" + number + "]");
                }

            } else {
                System.out.println("Invalid type");
                throw new RuntimeException("Invalid type");
            }
        }

        System.out.println("Execute method [" + method.getName() + "]");
        return method.invoke(this.target, args);

    }

    /**
     * Factory para crear proxy de Calculadora
     *
     * @param target
     * @return proxy de Calculadora
     */
    public static Calculadora proxyFactory(Calculadora target) {
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();

        return (Calculadora) Proxy.newProxyInstance(
                classLoader,
                interfaces,
                new CalculadoraProxyFactory(target)
        );
    }
}
