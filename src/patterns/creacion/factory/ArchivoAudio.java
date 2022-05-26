package patterns.creacion.factory;

public class ArchivoAudio implements IArchivo {
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo archivo de audio...");
    }
}
