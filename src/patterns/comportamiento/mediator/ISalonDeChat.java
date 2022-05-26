package patterns.comportamiento.mediator;

public interface ISalonDeChat {
    public abstract void registra(Usuario usuario);
    public abstract void envia(String de, String a, String msg);
}
