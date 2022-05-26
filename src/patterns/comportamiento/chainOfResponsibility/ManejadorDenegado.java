package patterns.comportamiento.chainOfResponsibility;

public class ManejadorDenegado extends Manejador {

    public ManejadorDenegado() {
    }

    @Override
    public void comprobar(String estado) {
        if( (estado!=null) && (estado.equalsIgnoreCase("DENEGADO")) ){
            System.out.println("Solicitud denegada");
        } else {
            if(this.getSiguiente() != null) {
                // Llamamos al metodo en el siguiente objeto
                this.getSiguiente().comprobar(estado);
            }
        }
    }
}
