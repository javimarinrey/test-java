package patterns.comportamiento.mediator;

/**
 * Mediator es un patrón de diseño de comportamiento que te permite reducir las dependencias caóticas entre objetos.
 * El patrón restringe las comunicaciones directas entre los objetos, forzándolos a colaborar
 * únicamente a través de un objeto mediador.
 *
 * Nuestro ejemplo será un chat: donde habrá usuarios que se comunicaran entre sí en un salón de chat.
 * Para ellos se define una interface llamada IUsuarioChat que todos los objetos que quieran participar de un chat
 * deberán implementar. La clase Ususario representa un usuario que quiera chatear
 */
public class Main {

    public static void main(String[] args) {

        SalonDeChat s = new SalonDeChat();

        Usuario u1 = new Usuario(s);
        u1.setNombre("Juan");
        s.registra(u1);

        Usuario u2 = new Usuario(s);
        u1.setNombre("Pepe");
        s.registra(u2);

        Usuario u3 = new Usuario(s);
        u1.setNombre("Pedro");
        s.registra(u3);

        u1.envia("Pepe", "Hola?");
        u2.envia("Juan", "Hola todo OK, vos?");
        u3.envia("Martin", "Martin estas?");
    }
}
