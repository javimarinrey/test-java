package patterns.comportamiento.command;

public class ResetearServer implements Command {

    private IServer server;

    public ResetearServer(IServer server) {
        this.server = server;
    }

    @Override
    public void execute() {
        server.conectar();
        server.verificarConexion();
        server.guardarLog();
        server.apagar();
        server.encender();
        server.guardarLog();
        server.cerrarConexion();
    }
}
