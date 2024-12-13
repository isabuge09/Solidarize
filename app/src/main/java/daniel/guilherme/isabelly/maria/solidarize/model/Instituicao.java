package daniel.guilherme.isabelly.maria.solidarize.model;

import java.util.List;

public class Instituicao {
    int foto;

    String nome;

    String descricao;

    List<String> categorias;

    boolean curtiu;

    public Instituicao(int foto, String nome, String descricao, List<String> categorias, boolean curtiu) {
        this.foto = foto;
        this.nome = nome;
        this.descricao = descricao;
        this.categorias = categorias;
        this.curtiu = curtiu;
    }
}
