package patterns.creacion.abstractFactory;

public class BluRay_CapaDoble extends BluRay {
    @Override
    public String getCapacidad() {
        return "32 GB";
    }

    @Override
    public String getNombre() {
        return "BluRay Capa Doble";
    }
}
