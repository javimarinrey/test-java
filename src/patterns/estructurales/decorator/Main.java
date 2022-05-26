package patterns.estructurales.decorator;

/**
 * Patrón que permite añadir funcionalidades a un objeto en aquellos casos en los que no sea necesario o
 * recomendable hacerlo mediante herencia
 *
 * Ejemplo: crear una clase que dibuje ventanas básicas, y utilizar el patrón para agregar barras de desplazamiento
 * sólo a algunas de ellas.
 *
 * Explicación:
 * - La clase abstracta DecoradorDesplazamiento es la encargada de definir las funcionalidades que se podrán agregar
 * a objetos que (como ella misma) implementan la interface IVentana.
 *
 * - Contiene además una referencia a otro objeto (asignada en el constructor) de tipo IVentana,
 * y en el método dibujar() que debe implementar simplemente se llama al método del mismo nombre en dicho objeto.
 *
 * - Los objetos que heredan de DecoradorDesplazamiento llaman al constructor de su clase padre pasándole
 * como parámetro el objeto de tipo IVentana recibido en su propio constructor
 * (para guardar una referencia al mismo y así poder acceder a él en otro momento).
 *
 * - Cuando se llama al método dibujar() de dichos objetos de tipo DecoradorDesplazamiento se crea la ventana básica,
 * y a continuación a un método propio para agregar la barra de desplazamiento deseada en cada caso.
 *
 * - Al iniciarse el programa se crea una ventana básica y luego otras que contendrán una
 * o ambas barras de desplazamiento según cada caso
 * (observa cómo en el tercer caso se encadenan los contructores para agregar ambas barras de desplazamiento).
 */
public class Main {

    public static void main(String[] args){

    }

}
