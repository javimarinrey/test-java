package patterns.creacion.prototype;

/**
 * Prototype es un patrón de diseño creacional que nos permite copiar objetos existentes
 * sin que el código dependa de sus clases.
 */
public class Main {

    public static void main(String[] args) {
        GestorEnemigo objGE = new GestorEnemigo();

        Enemigo g1 = objGE.getEnemigo("Samurai");

        System.out.println("=====================");

        System.out.println("El guerrero se llama " + g1.getNombre());
        System.out.println("Su arma es " + g1.getArma());


        Enemigo g2 = objGE.getClon("Samurai");

        System.out.println("Clon del guerrero creado:");
        System.out.println("Su nombre es " + g2.getNombre());
        System.out.println("Su arma es " + g2.getArma());

        System.out.println("=====================");

        g2.setNombre("Samurai II");
        g2.setArma("Hacha");

        // Mostrar los datos de ambos Guerreros (ambos tienen diferentes datos)
        System.out.println("Tras modificar el clon, ahora se llama " + g2.getNombre());
        System.out.println("Su arma es " + g2.getArma());
        System.out.println("El nombre del Guerrero original es " + g1.getNombre());
        System.out.println("Su arma es " + g1.getArma());

        System.out.println("======================");

        // Modificamos el Guerrero original
        g1.setNombre("Samurai-1");
        g1.setArma("MAZA");
        // Mostrar los datos de ambos Guerreros tras la modificación (ambos tienen diferentes datos)
        System.out.println("Tras modificar el original, ahora es " + g1.getNombre());
        System.out.println("Su arma es " + g1.getArma());
        System.out.println("El nombre del clon es " + g2.getNombre());
        System.out.println("Su arma es " + g2.getArma());
    }
}
