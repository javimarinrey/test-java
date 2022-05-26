package patterns.comportamiento.command;

/**
 * Command es un patrón de diseño de comportamiento que convierte una solicitud
 * en un objeto independiente que contiene toda la información sobre la solicitud.
 * Esta transformación te permite parametrizar los métodos con diferentes solicitudes,
 * retrasar o poner en cola la ejecución de una solicitud y soportar operaciones que no se pueden realizar.
 */
public class Main {

    public static void main(String[] args) {
        Command command = new EncenderServer(new ArgentinaServer());
        Invoker serverAdmin = new Invoker(command);
        serverAdmin.run();
    }
}
