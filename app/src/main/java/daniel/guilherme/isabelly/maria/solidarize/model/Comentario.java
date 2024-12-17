package daniel.guilherme.isabelly.maria.solidarize.model;

import java.util.Date;

public class Comentario {
    int foto;
    String usermname;
    String conteudo;
    boolean curtida;
    int nCurtidas;
    Date data;

    public Comentario(int foto, String usermname, String conteudo, boolean curtida, int nCurtidas, Date data) {
        this.foto = foto;
        this.usermname = usermname;
        this.conteudo = conteudo;
        this.curtida = curtida;
        this.nCurtidas = nCurtidas;
        this.data = data;
    }
}
