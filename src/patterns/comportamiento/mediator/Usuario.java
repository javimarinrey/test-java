package patterns.comportamiento.mediator;

public class Usuario implements IUsuarioChat {

    private String nombre;
    private SalonDeChat salon;

    public Usuario(SalonDeChat salon) {
        this.salon = salon;
    }

    @Override
    public void recibe(String de, String msg) {
        String s = "el usuario " + de + " te dice: " + msg;
        System.out.println(nombre + ": " + s);
    }

    @Override
    public void envia(String a, String msg) {
        salon.envia(nombre, a, msg);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public SalonDeChat getSalon() {
        return salon;
    }

    public void setSalon(SalonDeChat salon) {
        this.salon = salon;
    }
}
