/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observado;

import dados.Edicao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author camil
 */
public class RevistaConcreta extends Revista {

    private String nome;
    private ArrayList<Edicao> listaEdicoes = new ArrayList<>();

    public RevistaConcreta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void lancarNovaEdicao(Edicao edicao) {
        listaEdicoes.add(edicao);
        notificar(edicao.getNumero() + "", edicao.getTitulosArtigos());
    }

}
