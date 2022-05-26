package patterns.comportamiento.memento;

/**
 * Memento es un patrón de diseño de comportamiento que te permite guardar y restaurar
 * el estado previo de un objeto sin revelar los detalles de su implementación.
 */
public class Main {

    public static void main(String[] args){

        // Crear el objeto originador/creador
        Originator creador = new Originator("Javi", "Marin Rey");
        // Crear el objeto gestor/vigilante del Memento
        Caretaker vigilante = new Caretaker();
        // Crear el Memento y asociarlo al objeto gestor
        vigilante.setMemento(creador.createMemento());

        System.out.println("Nombre completo: [" + creador.getNombre() + " " + creador.getApellidos() + "]" );

        // Modificar los datos del objeto
        creador.setNombre("María");
        creador.setApellidos("Mora Miró");

        // Mostrar los datos del objeto
        System.out.println("Nombre completo: [" + creador.getNombre() + " " + creador.getApellidos() + "]" );
        // Restaurar los datos del objeto
        creador.setMemento( vigilante.getMemento() );
        // Mostrar los datos del objeto
        System.out.println("Nombre completo: [" + creador.getNombre() + " " + creador.getApellidos() + "]" );

    }


}
