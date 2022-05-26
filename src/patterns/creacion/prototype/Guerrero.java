package patterns.creacion.prototype;

public class Guerrero extends Enemigo {

    public Guerrero() {
        System.out.println("Guerrero creado");
    }

    @Override
    public Enemigo clonar() {
        Guerrero objGuerrero = new Guerrero();
        objGuerrero.setNombre(this.getNombre());
        objGuerrero.setArma(this.getArma());
        return objGuerrero;
    }

    @Override
    public void atacar() {
        System.out.println("El guerrero ataca");
    }

    @Override
    public void detener() {
        System.out.println("El guerrero se detiene");
    }
}
