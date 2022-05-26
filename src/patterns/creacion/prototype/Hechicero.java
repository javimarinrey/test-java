package patterns.creacion.prototype;

public class Hechicero extends Enemigo {

    public Hechicero() {
        System.out.println("Hechicero creado");
    }

    @Override
    public Enemigo clonar() {
        Hechicero objHechicero = new Hechicero();
        objHechicero.setNombre(this.getNombre());
        objHechicero.setArma(this.getArma());
        return objHechicero;
    }

    @Override
    public void atacar() {
        System.out.println("El hechicero ataca");
    }

    @Override
    public void detener() {
        System.out.println("El hechicero se detiene");
    }
}
