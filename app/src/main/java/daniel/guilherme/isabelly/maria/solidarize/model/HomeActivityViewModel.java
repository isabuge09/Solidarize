package daniel.guilherme.isabelly.maria.solidarize.model;

import androidx.lifecycle.ViewModel;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import daniel.guilherme.isabelly.maria.solidarize.R;

public class HomeActivityViewModel extends ViewModel {

    List<Evento> getEventos() {

        List<Evento> eventos = new ArrayList<>();


        Date dataHoraAtual = new Date();
        Evento e1 = new Evento("Instituto consuelo pinheiro",dataHoraAtual, "Doação de cestas básicas","evento destinado para doação");
        eventos.add(e1);

        return eventos;

    }
}
