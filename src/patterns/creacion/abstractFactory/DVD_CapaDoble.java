package patterns.creacion.abstractFactory;

public class DVD_CapaDoble extends DVD {
    @Override
    public String getCapacidad() {
        return "9 GB";
    }

    @Override
    public String getNombre() {
        return "DVD Capa Doble";
    }
}
