package teste;

import dados.Artigo;
import dados.Edicao;
import observado.RevistaConcreta;
import observador.Assinante;
import observador.WebSite;

/**
 *
 * @author camil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Dados
        Artigo artigo1 = new Artigo("Titulo 1");
        Artigo artigo2 = new Artigo("Titulo 2");
        Artigo artigo3 = new Artigo("Titulo 3");
        Artigo artigo4 = new Artigo("Titulo 4");
        Artigo artigo5 = new Artigo("Titulo 5");

        // Observado
        RevistaConcreta r1 = new RevistaConcreta("Revista 1");
        RevistaConcreta r2 = new RevistaConcreta("Revista 2");

        // Observador
        Assinante as1 = new Assinante("Camila", "end1");
        Assinante as2 = new Assinante("Gabriel", "end2");
        Assinante as3 = new Assinante("Rafael", "end3");
        Assinante as4 = new Assinante("Felisberto", "end4");

        // Observador
        WebSite ws = new WebSite("www.oblogdacamila.com.br");

        // O website deve se registrar em ambas as revistas
        r1.adicionar(ws);
        r2.adicionar(ws);
        
        // Registrando os assinantes na revista
        r1.adicionar(as1);
        r1.adicionar(as2);
        r1.adicionar(as3);
        r2.adicionar(as2);
        r2.adicionar(as4);
        
        //  Lance 1 edição com 2 artigos (com títulos T1 e T2) na R1
        Edicao edicao1 = new Edicao(1);
        edicao1.addArtigo(artigo1);
        edicao1.addArtigo(artigo2);
        r1.lancarNovaEdicao(edicao1);

        // Edição na R2 com 3 artigos (T3 a T5)
        Edicao edicao2 = new Edicao(2);
        edicao2.addArtigo(artigo3);
        edicao2.addArtigo(artigo4);
        edicao2.addArtigo(artigo5);
        r2.lancarNovaEdicao(edicao2);
    }
    
}
