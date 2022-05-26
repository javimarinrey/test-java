package patterns.estructurales.flyweight;

/**
 * Este patrón resulta tremendamente útil para evitar crear un gran número de objetos similares,
 * mejorando con ello el rendimiento de la aplicación.
 *
 * No se trata de crear muchos objetos de forma dinámica, sino de crear sólo un objeto intermedio para cada entidad concreta.
 */
public class Main {
    public static void main(String[] args) {
        FabricaDeLineas fabrica = new FabricaDeLineas();

        ILineaLigera linea1 = fabrica.getLine("AZUL");
        ILineaLigera linea2 = fabrica.getLine("ROJO");
        ILineaLigera linea3 = fabrica.getLine("AMARILLO");
        ILineaLigera linea4 = fabrica.getLine("AZUL");

        linea1.dibujar(100, 400);
        linea2.dibujar(200, 500);
        linea3.dibujar(300, 600);
        linea4.dibujar(400, 700);
    }
}
