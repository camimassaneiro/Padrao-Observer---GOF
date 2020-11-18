/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

import observado.Revista;

/**
 *
 * @author camil
 */
public interface Observador {

    public void atualizarAssinante(Revista revista, String numeroEdicao);

    public void atualizarWebsite(Revista revista, String numeroEdicao, String titulosArtigos);

}
