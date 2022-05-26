package patterns.estructurales.proxy;

public class ImagenReal implements Imagen {

    private String nombre;

    public ImagenReal(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarImagen() {
        System.out.println("Mostrando imagen: [" + nombre + "]");
    }
}
