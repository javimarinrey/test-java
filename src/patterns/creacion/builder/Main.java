package patterns.creacion.builder;

/**
 * Builder es un patrón de diseño creacional que nos permite construir objetos complejos paso a paso.
 * El patrón nos permite producir distintos tipos y representaciones de un objeto empleando el mismo código de construcción.
 */
public class Main {

    public static void main(String[] args){
        Director objFabrica = new Director();

        // Crear los objetos ConcreteBuilder
        BuilderCoche base = new ConstructorCocheBase();
        BuilderCoche medio = new ConstructorCocheMedio();
        BuilderCoche full = new ConstructorCocheFull();

        // Construir un coche con equipamiento base
        objFabrica.construir(base);
        Coche cocheBase = base.getCoche();

        // Construir un coche con equipamiento medio
        objFabrica.construir(medio);
        Coche cocheMedio = medio.getCoche();

        // Construir un coche con equipamiento full
        objFabrica.construir(full);
        Coche cocheFull = full.getCoche();

        mostrarCoche(cocheBase);
        mostrarCoche(cocheMedio);
        mostrarCoche(cocheFull);
    }

    public static void mostrarCoche(Coche coche) {
        System.out.println("Motor: " + coche.getMotor());
        System.out.println("Carroceria: " + coche.getCarroceria());
        System.out.println("Aire acondicionado: " + coche.getAireAcond());
        System.out.println("===========================================");
    }
}
