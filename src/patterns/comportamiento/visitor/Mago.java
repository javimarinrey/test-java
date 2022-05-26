package patterns.comportamiento.visitor;

public class Mago implements IPersonaje {
    public String arma = "";

    public Mago(){
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
