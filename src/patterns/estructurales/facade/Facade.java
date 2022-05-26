package patterns.estructurales.facade;

public class Facade {
    private ComprobarLiquidos liquidos;
    private ComprobarAsiento asiento;
    private ComprobarEspejos espejos;
    private Arrancar arrancar;

    public Facade() {
        this.liquidos = new ComprobarLiquidos();
        this.asiento = new ComprobarAsiento();
        this.espejos = new ComprobarEspejos();
        this.arrancar = new Arrancar();
    }

    public void arrancarCoche() {
        liquidos.comprobar();
        asiento.comprobar();
        espejos.comprobar();
        arrancar.encenderContacto();
    }
}
