package patterns.estructurales.flyweight;

public class Linea implements ILineaLigera {

    private String color;

    public Linea(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void dibujar(int col, int fila) {
        System.out.println("Dibujando línea de color [" + this.color + "] en [" + col + ", " + fila + "]");
    }
}
