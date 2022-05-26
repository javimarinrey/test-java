package patterns.creacion.prototype;

import java.util.Hashtable;

public class GestorEnemigo {

    // Para almacenar los objetos de tipo Prototype que se vayan creando
    private Hashtable hEnemigos = new Hashtable();

    public GestorEnemigo() {

        // Crear un Hechicero y asignarle propiedades
        Enemigo h1 = new Hechicero();
        h1.setNombre("Merlin");
        h1.setArma("Varita");

        // Guardarlo
        this.addEnemigo(h1.getNombre(), h1);

        // Crear un Guerrero y asignarle propiedades
        Enemigo g1 = new Guerrero();
        g1.setNombre("Samurai");
        g1.setArma("Espada");

        // Guardarlo
        this.addEnemigo(g1.getNombre(), g1);
    }

    public void addEnemigo(String nombre, Enemigo objEnemigo) {
        this.hEnemigos.put(nombre, objEnemigo);
    }

    public Enemigo getEnemigo(String nombre) {
        Enemigo objPrototipo = (Guerrero) hEnemigos.get(nombre);
        return objPrototipo;
    }

    public Enemigo getClon(String nombre) {

        Enemigo objPrototipo = (Guerrero) hEnemigos.get(nombre);

        try {

            return (Enemigo) objPrototipo.clonar();

        } catch (Exception e) {
            System.out.println("Error al crear el clon, salimos");
            System.exit(0);
        }
        return null;
    }

}
