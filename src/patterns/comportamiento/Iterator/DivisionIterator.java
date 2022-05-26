package patterns.comportamiento.Iterator;

import java.util.Iterator;

public class DivisionIterator implements Iterator<Empleado> {

    private Empleado[] empleados;
    private int location = 0;

    public DivisionIterator(Empleado[] empleados) {
        this.empleados = empleados;
    }

    @Override
    public boolean hasNext() {
        return location < empleados.length && empleados[location] != null;
    }

    @Override
    public Empleado next() {
        return empleados[location++];
    }

    public void remove(){

    }
}
