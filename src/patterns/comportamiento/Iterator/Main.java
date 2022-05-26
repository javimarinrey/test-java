package patterns.comportamiento.Iterator;

import java.util.Iterator;

/**
 * Iterator es un patrón de diseño de comportamiento que te permite recorrer elementos de una colección
 * sin exponer su representación subyacente (lista, pila, árbol, etc.).
 */
public class Main {

    public static void main(String[] args){
        Division d = new Division("Mi sucursal");
        d.add("Empleado 1");
        d.add("Empleado 2");

        Iterator<Empleado> iterator = d.iterator();
        while (iterator.hasNext()) {
            Empleado e = iterator.next();
            e.print();
        }
    }
}
