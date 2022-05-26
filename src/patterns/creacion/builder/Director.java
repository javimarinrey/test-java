package patterns.creacion.builder;

public class Director {

    public void construir(BuilderCoche builder) {
        builder.crearNuevoCoche();

        builder.construirMotor();
        builder.construirCarroceria();
        builder.construirAireAcond();
    }
}
