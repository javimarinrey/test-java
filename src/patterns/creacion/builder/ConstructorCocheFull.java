package patterns.creacion.builder;

public class ConstructorCocheFull extends BuilderCoche {
    @Override
    public void construirMotor() {
        this.coche.setMotor("Motor de potencia alta");
    }

    @Override
    public void construirCarroceria() {
        this.coche.setCarroceria("Carrocería de protección alta");
    }

    @Override
    public void construirAireAcond() {
        this.coche.setAireAcond(true);
    }
}
