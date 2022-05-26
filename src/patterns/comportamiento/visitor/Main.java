package patterns.comportamiento.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Visitor es un patrón de diseño de comportamiento que te permite separar algoritmos
 * de los objetos sobre los que operan.
 */
public class Main {
    public static void main(String[] args) {
        Guerrero g1 = new Guerrero();
        Guerrero g2 = new Guerrero();
        Mago m1 = new Mago();
        Mago m2 = new Mago();

        List<IPersonaje> personajes = new ArrayList<>();
        personajes.add(g1);
        personajes.add(g2);
        personajes.add(m1);
        personajes.add(m2);

        IVisitor visitorArma = new EquiparArma();
        visitorArma.visit(personajes);

        System.out.println("Arma del guerrero g1: " + g1.getArma());
        System.out.println("Arma del guerrero g2: " + g2.getArma());
        System.out.println("Arma del mago m1: " + m1.getArma());
        System.out.println("Arma del mago m2: " + m2.getArma());
    }
}
