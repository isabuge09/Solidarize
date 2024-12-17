package daniel.guilherme.isabelly.maria.solidarize.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventoActivityViewModel {

    public List<Comentario> getComentarios() {

        List<Comentario> comentarios = new ArrayList<>();

        Comentario c1 = new Comentario(1,"dani", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",false, 50, new Date());
        comentarios.add(c1);
        Comentario c2 = new Comentario(1,"gui", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",true,50, new Date());
        comentarios.add(c2);
        Comentario c3 = new Comentario(1,"isa", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",false,50, new Date());
        comentarios.add(c3);
        Comentario c4 = new Comentario(1,"malu", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",true,50, new Date());
        comentarios.add(c4);

        return comentarios;
    }
}
