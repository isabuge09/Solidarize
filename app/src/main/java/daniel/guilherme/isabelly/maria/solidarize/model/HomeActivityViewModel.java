package daniel.guilherme.isabelly.maria.solidarize.model;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HomeActivityViewModel extends ViewModel {

    public List<Evento> getEventos() {

        List<Evento> eventos = new ArrayList<>();

        Date dataHoraAtual = new Date();
        Evento e1 = new Evento("Instituição ABC", dataHoraAtual, "Distribuição de alimentos", "Assistência Social", "Organizador X", "Evento para distribuição de alimentos a famílias carentes");
        Evento e2 = new Evento("Instituto São João", dataHoraAtual, "Campanha de arrecadação de roupas", "Educação", "Organizador Y", "Campanha para arrecadar roupas para crianças carentes");
        Evento e3 = new Evento("Cidadania Ativa", dataHoraAtual, "Ação de limpeza comunitária", "Meio Ambiente", "Organizador Z", "Evento para limpeza de praças públicas");

        eventos.add(e1);
        eventos.add(e2);
        eventos.add(e3);

        return eventos;
    }

    public List<Instituicao> getInstituicoes() {

        List<String> categorias = new ArrayList<>();
        categorias.add("Meio ambiente");
        categorias.add("Saúde");
        categorias.add("Educação");

        List<Instituicao> instituicoes = new ArrayList<>();

        Instituicao i1 = new Instituicao(1, "Instituto Cidadania Viva", "Distribuição de alimentos", categorias);
        Instituicao i2 = new Instituicao(2, "ONG Esperança", "Campanha de arrecadação de roupas", categorias);
        Instituicao i3 = new Instituicao(3, "Fundação Vida Melhor", "Projeto de assistência médica", categorias);
        Instituicao i4 = new Instituicao(4, "Projeto Verde", "Ações de preservação ambiental", categorias);
        Instituicao i5 = new Instituicao(5, "Instituto Jovem Saber", "Oficinas educativas para jovens", categorias);

        instituicoes.add(i1);
        instituicoes.add(i2);
        instituicoes.add(i3);
        instituicoes.add(i4);
        instituicoes.add(i5);

        return instituicoes;
    }

    public List<Voluntariado> getVoluntariados() {

        List<Voluntariado> voluntariados = new ArrayList<>();

        Voluntariado v1 = new Voluntariado(1, "Voluntários do Bem", "Carga Horária: 4h", "a");
        Voluntariado v2 = new Voluntariado(2, "Jardineiros Urbanos", "Carga Horária: 5h", "a");
        Voluntariado v3 = new Voluntariado(3, "Educadores Sociais", "Carga Horária: 3h", "a");
        Voluntariado v4 = new Voluntariado(4, "Assistência Alimentar", "Carga Horária: 6h", "a");
        Voluntariado v5 = new Voluntariado(5, "Mãos que Ajudam", "Carga Horária: 4h", "a");

        voluntariados.add(v1);
        voluntariados.add(v2);
        voluntariados.add(v3);
        voluntariados.add(v4);
        voluntariados.add(v5);

        return voluntariados;
    }

    public List<PerfilColaboracao> getColaboracoes() {
        List<PerfilColaboracao> colaboracoes = new ArrayList<>();

        PerfilColaboracao c1 = new PerfilColaboracao(1);
        PerfilColaboracao c2 = new PerfilColaboracao(2);
        PerfilColaboracao c3 = new PerfilColaboracao(3);
        PerfilColaboracao c4 = new PerfilColaboracao(4);
        PerfilColaboracao c5 = new PerfilColaboracao(5);

        colaboracoes.add(c1);
        colaboracoes.add(c2);
        colaboracoes.add(c3);
        colaboracoes.add(c4);
        colaboracoes.add(c5);

        return colaboracoes;
    }
}
