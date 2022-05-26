package patterns.comportamiento.command;

public interface IServer {

    public void apagar();
    public void encender();
    public void conectar();
    public void verificarConexion();
    public void guardarLog();
    public void cerrarConexion();
}
