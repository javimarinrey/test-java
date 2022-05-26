package patterns.comportamiento.chainOfResponsibility;

/**
 * Chain of Responsibility es un patrón de diseño de comportamiento que te permite pasar solicitudes
 * a lo largo de una cadena de manejadores. Al recibir una solicitud, cada manejador decide si la procesa
 * o si la pasa al siguiente manejador de la cadena.
 */
public class Main {

    public static void main(String[] args) {

        Manejador m1 = new ManejadorAprobado();
        Manejador m2 = new ManejadorDenegado();
        Manejador m3 = new ManejadorPendiente();

        m1.setSiguiente(m2);
        m2.setSiguiente(m3);

        m1.comprobar("APROBADO");
        m2.comprobar("APROBADO");
        m1.comprobar("DENEGADO");
        m1.comprobar(null);
        m1.comprobar("DENEGADO");

    }
}
