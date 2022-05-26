package patterns.comportamiento.chainOfResponsibility;

public class ManejadorAprobado extends Manejador {

    public ManejadorAprobado() {
    }

    @Override
    public void comprobar(String estado) {
        if( (estado!=null) && (estado.equalsIgnoreCase("APROBADO")) ){
            System.out.println("Solicitud aprobada");
        } else {
            if(this.getSiguiente() != null) {
                // Llamamos al metodo en el siguiente objeto
                this.getSiguiente().comprobar(estado);
            }
        }
    }
}
