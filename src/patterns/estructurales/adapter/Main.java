package patterns.estructurales.adapter;

/**
 * Adapter es un patrón de diseño estructural que permite la colaboración entre objetos con interfaces incompatibles.
 */
public class Main {

    public static void main(String[] args) {
        Adaptador conversor = new Adaptador();
        conversor.ingresarPesestas(2000);
        conversor.ingresarPesestas(5000);
        conversor.ingresarPesestas(1000);
        System.out.println("Total euros = " + conversor.getSaldo());
    }
}
