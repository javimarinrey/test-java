package patterns.estructurales.bridge;

public class Main {
    public static void main(String[] args) {

        // Crear un objeto de tipo 'AbstraccionRefinada' indicándole un 'ImplementadorConcreto'
        ElaborarAlimento lasasna = new ElaborarLasana( new Carne() );
        lasasna.obtener();

        // Ahora le indicamos que use otra implementación para obtener la de verduras
        lasasna.setImplementador( new Verduras() );
        lasasna.obtener();


    }
}
