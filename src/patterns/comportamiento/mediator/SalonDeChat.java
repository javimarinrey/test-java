package patterns.comportamiento.mediator;

import java.util.HashMap;

public class SalonDeChat implements ISalonDeChat {

    private HashMap<String, Usuario> participantes = new HashMap<String, Usuario>();

    @Override
    public void registra(Usuario usuario) {
        participantes.put(usuario.getNombre(), usuario);
    }

    @Override
    public void envia(String de, String a, String msg) {
        if (participantes.containsKey(de) && participantes.containsKey(a)) {
            Usuario u = participantes.get(a);
            u.recibe(de, msg);
        } else {
            System.out.println("Usuario inexistente");
        }
    }
}
