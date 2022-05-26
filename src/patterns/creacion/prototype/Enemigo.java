package patterns.creacion.prototype;

public abstract class Enemigo {

    private String nombre = "";
    private String arma = "";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public abstract Enemigo clonar();
    public abstract void atacar();
    public abstract void detener();

}
