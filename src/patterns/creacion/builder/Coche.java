package patterns.creacion.builder;

public class Coche {

    private String motor = "";
    private String carroceria = "";
    private Boolean aireAcond = false;

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public Boolean getAireAcond() {
        return aireAcond;
    }

    public void setAireAcond(Boolean aireAcond) {
        this.aireAcond = aireAcond;
    }
}
