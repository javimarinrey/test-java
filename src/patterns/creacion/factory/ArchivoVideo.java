package patterns.creacion.factory;

public class ArchivoVideo implements IArchivo {
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo archivo de video...");
    }
}
