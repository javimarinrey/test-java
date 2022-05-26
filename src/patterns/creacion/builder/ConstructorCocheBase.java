package patterns.creacion.builder;

public class ConstructorCocheBase extends BuilderCoche {
    @Override
    public void construirMotor() {
        this.coche.setMotor("Motor de potencia mínima");
    }

    @Override
    public void construirCarroceria() {
        this.coche.setCarroceria("Carrocería de baja protección");
    }

    @Override
    public void construirAireAcond() {
        this.coche.setAireAcond(false);
    }
}
