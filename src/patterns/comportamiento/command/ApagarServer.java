package patterns.comportamiento.command;

public class ApagarServer implements Command {

    private IServer server;

    public ApagarServer(IServer server) {
        this.server = server;
    }

    @Override
    public void execute() {
        server.conectar();
        server.verificarConexion();
        server.guardarLog();
        server.apagar();
        server.cerrarConexion();
    }
}
