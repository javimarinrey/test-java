package patterns.creacion.abstractFactory;

public class BluRay_CapaSimple extends BluRay {
    @Override
    public String getCapacidad() {
        return "16 GB";
    }

    @Override
    public String getNombre() {
        return "BluRay Capa Simple";
    }
}
