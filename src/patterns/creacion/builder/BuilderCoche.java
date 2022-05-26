package patterns.creacion.builder;

public abstract class BuilderCoche {
    protected Coche coche;

    public Coche getCoche() {
        return this.coche;
    }

    public void crearNuevoCoche() {
        this.coche = new Coche();
    }

    public abstract void construirMotor();
    public abstract void construirCarroceria();
    public abstract void construirAireAcond();
}
