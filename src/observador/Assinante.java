package observador;

import dados.Edicao;
import observado.Revista;
import observado.RevistaConcreta;

/**
 *
 * @author camil
 */
public class Assinante implements Observador {

    private String nome;
    private String endereco;

    public Assinante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public void atualizarAssinante(Revista revista, String numeroEdicao) {
        System.out.println("ASSINANTES\n"+ "Assinante: " 
                + this.nome + ", recebeu a revista " + ((RevistaConcreta) revista).getNome()
                + " da edição: " + numeroEdicao 
                + "\n------------------------------------------------------------\n");
    }

    @Override
    public void atualizarWebsite(Revista revista, String numeroEdicao, String titulosArtigos) {
   
    }

}
