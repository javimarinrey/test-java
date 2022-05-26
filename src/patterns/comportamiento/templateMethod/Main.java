package patterns.comportamiento.templateMethod;

/**
 * Template Method es un patrón de diseño de comportamiento que define el esqueleto de un algoritmo en la superclase
 * pero permite que las subclases sobrescriban pasos del algoritmo sin cambiar su estructura.
 */
public class Main {

    public static void main(String[] args) {
        ClaseConcreta1 cc1 = new ClaseConcreta1();
        ClaseConcreta2 cc2 = new ClaseConcreta2();

        int num1 = cc1.obtener(3);
        System.out.println("num1: " + num1);

        int num2 = cc2.obtener(50);
        System.out.println("num2: " + num2);
    }

}
