package patterns.creacion.abstractFactory;

public class DVD_CapaSimple extends DVD {
    @Override
    public String getCapacidad() {
        return "4.7GB";
    }

    @Override
    public String getNombre() {
        return "DVD Capa Simple";
    }
}
