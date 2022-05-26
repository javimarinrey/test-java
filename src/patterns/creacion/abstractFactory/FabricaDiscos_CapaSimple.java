package patterns.creacion.abstractFactory;

public class FabricaDiscos_CapaSimple implements FabricaDiscos {
    @Override
    public BluRay crearBluRay() {
        return new BluRay_CapaSimple();
    }

    @Override
    public DVD crearDVD() {
        return new DVD_CapaSimple();
    }
}
