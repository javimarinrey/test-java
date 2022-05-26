package patterns.comportamiento.command;

public class EncenderServer implements Command {

    private IServer server;

    public EncenderServer(IServer server) {
        this.server = server;
    }

    @Override
    public void execute() {
        server.conectar();
        server.verificarConexion();
        server.encender();
        server.guardarLog();
        server.cerrarConexion();
    }
}
