package patterns.estructurales.proxy;

public class ImagenProxy implements Imagen {

    private String nombreImagen = "";
    private ImagenReal imagen = null;

    public ImagenProxy(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    @Override
    public void mostrarImagen() {
        if (this.imagen == null) {
            this.imagen = new ImagenReal(nombreImagen);
        }
        this.imagen.mostrarImagen();
    }
}
