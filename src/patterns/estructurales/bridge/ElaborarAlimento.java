package patterns.estructurales.bridge;

public abstract class ElaborarAlimento {

    IElaborar implementador;
    String nombre;

    public IElaborar getImplementador(){
        return this.implementador;
    }

    public void setImplementador(IElaborar implementador) {
        this.implementador = implementador;
    }

    public abstract void obtener();
}
