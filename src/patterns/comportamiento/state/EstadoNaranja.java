package patterns.comportamiento.state;

public class EstadoNaranja extends EstadoSemaforo {
    @Override
    public void mostrar() {
        System.out.println("Luz naranja");
    }
}
