package patterns.comportamiento.state;

/**
 * State es un patrón de diseño de comportamiento que permite a un objeto alterar su comportamiento
 * cuando su estado interno cambia. Parece como si el objeto cambiara su clase.
 */
public class Main {

    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        // Muestra el aviso por defecto (verde, no hay alerta)
        semaforo.mostrar();

        semaforo.setEstado(new EstadoNaranja());
        semaforo.mostrar();

        semaforo.setEstado(new EstadoRojo());
        semaforo.mostrar();
    }



}
