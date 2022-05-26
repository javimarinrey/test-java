package patterns.estructurales.proxy;

/**
 * Este patrón se basa en proporcionar un objeto que haga de intermediario (proxy) de otro, para controlar el acceso a él.
 *
 * Veamos un ejemplo de Proxy virtual en el que abrimos un documento que contiene una imagen, la cual se cargará y
 * mostrará cuando el usuario haga scroll.
 */
public class Main {

    public static void main(String[] args) {
        Documento doc = new Documento("Presupuesto.doc");
        try {

            // Pausamos la ejecución del programa durante 3 segundos
            Thread.sleep(300);

            // Simulamos que el usuario hace scroll
            doc.hacerScroll();

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
        }
    }

}
