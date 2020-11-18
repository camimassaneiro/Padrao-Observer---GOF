package observador;

import dados.Edicao;
import observado.Revista;
import observado.RevistaConcreta;

/**
 *
 * @author camil
 */
public class WebSite implements Observador {

    private String url;

    public WebSite(String url) {
        this.url = url;
    }

    @Override
    public void atualizarAssinante(Revista revista, String numeroEdicao) {

    }

    @Override
    public void atualizarWebsite(Revista revista, String numeroEdicao, String titulosArtigos) {
        System.out.println("WEB SITE \n" + "Revista: \n" + ((RevistaConcreta) revista).getNome()
                + " da edição: " + numeroEdicao + "\n" + "Titulos:\n" + titulosArtigos
                + "\n--------------------------------------------------------------------\n");
    }
}
