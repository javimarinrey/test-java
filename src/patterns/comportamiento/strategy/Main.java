package patterns.comportamiento.strategy;

/**
 * Strategy es un patrón de diseño de comportamiento que te permite definir una familia de algoritmos,
 * colocar cada uno de ellos en una clase separada y hacer sus objetos intercambiables.
 */
public class Main {

    public static void main(String[] args) {
        OperacionAritmetica context;

        context = new OperacionAritmetica(new Sumar());
        int suma = context.procesar(3, 4);

        context = new OperacionAritmetica(new Restar());
        int resta = context.procesar(3, 4);

        context = new OperacionAritmetica(new Multiplicar());
        int multip = context.procesar(3, 4);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multip);
    }
}
