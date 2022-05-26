package patterns.comportamiento.state;

public class Semaforo {

    private EstadoSemaforo estadoSemaforo;

    public Semaforo() {
        this.estadoSemaforo = new EstadoVerde();
    }

    public void setEstado(EstadoSemaforo estado) {
        this.estadoSemaforo = estado;
    }

    public void mostrar() {
        this.estadoSemaforo.mostrar();
    }

}
