package daniel.guilherme.isabelly.maria.solidarize.model;

import androidx.lifecycle.ViewModel;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HomeActivityViewModel extends ViewModel {

    public List<Evento> getEventos() {

        List<Evento> eventos = new ArrayList<>();

        Date dataHoraAtual = new Date();
        Evento e1 = new Evento("Instituto consuelo pinheiro",dataHoraAtual, "Doação de cestas básicas","evento destinado para doação");
        eventos.add(e1);
        Evento e2 = new Evento("Instituto consuelo pinheiro",dataHoraAtual, "Doação de cestas básicas","evento destinado para doação");
        eventos.add(e2);
        Evento e3 = new Evento("Instituto consuelo pinheiro",dataHoraAtual, "Doação de cestas básicas","evento destinado para doação");
        eventos.add(e3);
        Evento e4 = new Evento("Instituto consuelo pinheiro",dataHoraAtual, "Doação de cestas básicas","evento destinado para doação");
        eventos.add(e4);
        Evento e5 = new Evento("Instituto consuelo pinheiro",dataHoraAtual, "Doação de cestas básicas","evento destinado para doação");
        eventos.add(e5);
        Evento e6 = new Evento("Instituto consuelo pinheiro",dataHoraAtual, "Doação de cestas básicas","evento destinado para doação");
        eventos.add(e6);
        Evento e7 = new Evento("Instituto consuelo pinheiro",dataHoraAtual, "Doação de cestas básicas","evento destinado para doação");
        eventos.add(e7);
        Evento e8 = new Evento("Instituto consuelo pinheiro",dataHoraAtual, "Doação de cestas básicas","evento destinado para doação");
        eventos.add(e8);
        Evento e9 = new Evento("Instituto consuelo pinheiro",dataHoraAtual, "Doação de cestas básicas","evento destinado para doação");
        eventos.add(e9);
        Evento e10 = new Evento("Instituto consuelo pinheiro",dataHoraAtual, "Doação de cestas básicas","evento destinado para doação");
        eventos.add(e10);
        Evento e11 = new Evento("Instituto consuelo pinheiro",dataHoraAtual, "Doação de cestas básicas","evento destinado para doação");
        eventos.add(e11);
        Evento e12 = new Evento("Instituto consuelo pinheiro",dataHoraAtual, "Doação de cestas básicas","evento destinado para doação");
        eventos.add(e12);

        return eventos;

    }

    public List<Instituicao> getInstituicoes() {

        List<String> categorias = new ArrayList<>();
        categorias.add("meio ambiente");

        List<Instituicao> instituicoes = new ArrayList<>();

        Instituicao i1 = new Instituicao(1,"Instituto consuelo pinheiro", "Doação de cestas básicas",categorias);
        instituicoes.add(i1);
        Instituicao i2 = new Instituicao(1,"Instituto consuelo pinheiro","Doação de cestas básicas",categorias);
        instituicoes.add(i2);
        Instituicao i3 = new Instituicao(1,"Instituto consuelo pinheiro", "Doação de cestas básicas", categorias);
        instituicoes.add(i3);
        Instituicao i4 = new Instituicao(1,"Instituto consuelo pinheiro","Doação de cestas básicas",categorias);
        instituicoes.add(i4);
        Instituicao i5 = new Instituicao(1,"Instituto consuelo pinheiro", "Doação de cestas básicas",categorias);
        instituicoes.add(i5);
        Instituicao i6 = new Instituicao(1,"Instituto consuelo pinheiro", "Doação de cestas básicas",categorias);
        instituicoes.add(i6);
        Instituicao i7 = new Instituicao(1,"Instituto consuelo pinheiro","Doação de cestas básicas",categorias);
        instituicoes.add(i7);
        Instituicao i8 = new Instituicao(1,"Instituto consuelo pinheiro","Doação de cestas básicas",categorias);
        instituicoes.add(i8);
        Instituicao i9 = new Instituicao(1,"Instituto consuelo pinheiro","Doação de cestas básicas",categorias);
        instituicoes.add(i9);
        Instituicao i10 = new Instituicao(1,"Instituto consuelo pinheiro","Doação de cestas básicas",categorias);
        instituicoes.add(i10);
        Instituicao i11 = new Instituicao(1,"Instituto consuelo pinheiro","Doação de cestas básicas",categorias);
        instituicoes.add(i11);
        Instituicao i12 = new Instituicao(1,"Instituto consuelo pinheiro","Doação de cestas básicas",categorias);
        instituicoes.add(i12);

        return instituicoes;

    }

    public List<Voluntariado> getVoluntariados() {

        List<Voluntariado> voluntariados = new ArrayList<>();

        Voluntariado v1 = new Voluntariado(1, "Jardineiros Urbanos", "Carga Horária: 4h");
        voluntariados.add(v1);
        Voluntariado v2 = new Voluntariado(1, "Jardineiros Urbanos", "Carga Horária: 4h");
        voluntariados.add(v2);
        Voluntariado v3 = new Voluntariado(1, "Jardineiros Urbanos", "Carga Horária: 4h");
        voluntariados.add(v3);
        Voluntariado v4 = new Voluntariado(1, "Jardineiros Urbanos", "Carga Horária: 4h");
        voluntariados.add(v4);
        Voluntariado v5 = new Voluntariado(1, "Jardineiros Urbanos", "Carga Horária: 4h");
        voluntariados.add(v5);
        Voluntariado v6 = new Voluntariado(1, "Jardineiros Urbanos", "Carga Horária: 4h");
        voluntariados.add(v6);
        Voluntariado v7 = new Voluntariado(1, "Jardineiros Urbanos", "Carga Horária: 4h");
        voluntariados.add(v7);
        Voluntariado v8 = new Voluntariado(1, "Jardineiros Urbanos", "Carga Horária: 4h");
        voluntariados.add(v8);
        Voluntariado v9 = new Voluntariado(1, "Jardineiros Urbanos", "Carga Horária: 4h");
        voluntariados.add(v9);
        Voluntariado v10 = new Voluntariado(1, "Jardineiros Urbanos", "Carga Horária: 4h");
        voluntariados.add(v10);
        Voluntariado v11 = new Voluntariado(1, "Jardineiros Urbanos", "Carga Horária: 4h");
        voluntariados.add(v11);
        Voluntariado v12 = new Voluntariado(1, "Jardineiros Urbanos", "Carga Horária: 4h");
        voluntariados.add(v12);


        return voluntariados;

    }

    public List<PerfilColaboracao> getColaboracoes(){
        List<PerfilColaboracao> colaboracoes = new ArrayList<>();

        PerfilColaboracao c1 = new PerfilColaboracao(1);
        colaboracoes.add(c1);
        PerfilColaboracao c2 = new PerfilColaboracao(1);
        colaboracoes.add(c2);
        PerfilColaboracao c3 = new PerfilColaboracao(1);
        colaboracoes.add(c3);
        PerfilColaboracao c4 = new PerfilColaboracao(1);
        colaboracoes.add(c4);
        PerfilColaboracao c5 = new PerfilColaboracao(1);
        colaboracoes.add(c5);

        return colaboracoes;
    }


}
