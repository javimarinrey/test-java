package patterns.estructurales.flyweight;

import java.util.List;

public class FabricaDeLineas {

    private List<ILineaLigera> lineas;

    public FabricaDeLineas() {
    }

    public FabricaDeLineas(List<ILineaLigera> lineas) {
        this.lineas = lineas;
    }

    public ILineaLigera getLine(String color) {

        // Comprobar si hemos creado una línea con el color solicitado, y devolverla en tal caso
        for(ILineaLigera linea : this.lineas) {
            if (linea.getColor().equals(color)) {
                System.out.println("línea de color [" + color + "] encontrada, la devolvemos");
                return linea;
            }
        }

        // Si no ha sido creada la creamos ahora, la agregamos a la lista y la devolvemos
        ILineaLigera linea = new Linea(color);
        this.lineas.add(linea);

        return linea;
    }
}
