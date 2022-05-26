package patterns.estructurales.proxy;

public class Documento {
    private String nombreDoc;
    private String texto;
    private ImagenProxy imagenProxy;

    public Documento(String nombreDoc) {
        this.setNombreDoc(nombreDoc);
        this.cargarContenido();
        this.mostrar();
    }

    public String getNombreDoc() {
        return nombreDoc;
    }

    public void setNombreDoc(String nombreDoc) {
        this.nombreDoc = nombreDoc;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void cargarContenido(){
        this.texto = "Texto del documento";
        this.imagenProxy = new ImagenProxy("imagen.jpg");
        System.out.println("Documento cargado en memoria");
    }

    public void mostrar() {
        System.out.println("Mostrando el contenido...\n");
    }

    public void hacerScroll() {
        System.out.println("El usuario ha hecho scroll...");
        imagenProxy.mostrarImagen();
    }

}
