package patterns.creacion.abstractFactory;

/**
 * Abstract Factory es un patrón de diseño creacional que nos permite producir familias de objetos relacionados
 * sin especificar sus clases concretas.
 */
public class Main {

    public static void main(String[] args) {
        FabricaDiscos fabrica;
        DVD dvd;
        BluRay bluRay;

        fabrica = new FabricaDiscos_CapaSimple();
        dvd = fabrica.crearDVD();
        bluRay = fabrica.crearBluRay();

        System.out.println(dvd.getNombre() + " - " + dvd.getCapacidad());
        System.out.println(bluRay.getNombre() + " - " + bluRay.getCapacidad());
    }
}
