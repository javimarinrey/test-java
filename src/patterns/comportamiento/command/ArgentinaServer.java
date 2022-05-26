package patterns.comportamiento.command;

public class ArgentinaServer implements IServer {
    @Override
    public void apagar() {
        System.out.println("Apagando el servidor de Argentina");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo el servidor de Argentina");
    }

    @Override
    public void conectar() {
        System.out.println("Conectando el servidor de Argentina");
    }

    @Override
    public void verificarConexion() {
        System.out.println("Verificando el servidor de Argentina");
    }

    @Override
    public void guardarLog() {
        System.out.println("Guardando log en el servidor de Argentina");
    }

    @Override
    public void cerrarConexion() {
        System.out.println("Cerrando conexion en el servidor de Argentina");
    }
}
