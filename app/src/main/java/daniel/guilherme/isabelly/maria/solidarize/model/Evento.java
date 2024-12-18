package daniel.guilherme.isabelly.maria.solidarize.model;

import java.util.Date;

public class Evento {

    String nomeIntituicao;
    Date data;
    String titulo;
    String categoria;
    String organizador;

    String descricao;

    public Evento(String nomeIntituicao, Date data, String titulo, String categoria, String organizador, String descricao) {
        this.nomeIntituicao = nomeIntituicao;
        this.data = data;
        this.titulo = titulo;
        this.categoria = categoria;
        this.organizador = organizador;
        this.descricao = descricao;
    }


}
