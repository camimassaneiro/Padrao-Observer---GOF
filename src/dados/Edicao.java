package dados;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author camil
 */
public class Edicao {

    private List<Artigo> artigos = new ArrayList<>();
    private int numero;

    public Edicao(int numero) {
        this.numero = numero;
    }

    public void addArtigo(Artigo artigo) {
        artigos.add(artigo);
    }

    public List<Artigo> getArtigos() {
        return artigos;
    }

    public void setArtigos(List<Artigo> artigos) {
        this.artigos = artigos;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitulosArtigos() {
        String titulos = "";

        for (Artigo artigo : artigos) {
            titulos += "Titulo: " + artigo.getTitulo() + "\n";
        }
        return titulos;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
