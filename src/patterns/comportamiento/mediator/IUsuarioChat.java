package patterns.comportamiento.mediator;

public interface IUsuarioChat {
    public void recibe(String de, String msg);
    public void envia(String a, String msg);
}
