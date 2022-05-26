package patterns.comportamiento.Iterator;

public class Division {
    private Empleado[] empleados = new Empleado[100];
    private int numero = 0;
    private String nombreDivision;

    public Division(String nombre) {
        this.nombreDivision = nombre;
    }

    public String getNombre(){
        return nombreDivision;
    }

    public void add(String nombre) {
        Empleado empleado = new Empleado(nombre, nombreDivision);
        empleados[numero++] = empleado;
    }

    public DivisionIterator iterator(){
        return new DivisionIterator(empleados);
    }

}
