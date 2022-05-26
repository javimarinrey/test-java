package patterns.comportamiento.Iterator;

public class Empleado {

    private String nombre;
    private String division;

    public Empleado(String nombre, String division) {
        this.nombre = nombre;
        this.division = division;
    }

    public String getNombre() {
        return nombre;
    }

    public void print(){
        System.out.println("Nombre: " + nombre + " Division: " + division);
    }
}
