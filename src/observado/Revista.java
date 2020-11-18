/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observado;

import dados.Edicao;
import java.util.ArrayList;
import java.util.List;
import observador.Observador;

/**
 *
 * @author camil
 */
// Observado
public abstract class Revista {

    private List<Observador> observadores = new ArrayList<>();

    public void adicionar(Observador obs) {
        observadores.add(obs);
    }

    public void remover(Observador obs) {
        observadores.remove(obs);
    }

    public void notificar(String numeroEdicao, String titulosArtigos) {
        for (Observador obs : observadores) {
            obs.atualizarAssinante(this, numeroEdicao);
            obs.atualizarWebsite(this, numeroEdicao, titulosArtigos);
        }

    }
}
