package inventário;
public class CD extends Produto {
    private String artista;
    private int numDeMusicas;
    private int selo;

    public CD(String artista, int numDeMusicas, int selo, int numeroItem, int qtdEstoque, String nomeProd, double precoItem, String ativo) {
        super(numeroItem, qtdEstoque, nomeProd, precoItem, ativo);
        this.artista = artista;
        this.numDeMusicas = numDeMusicas;
        this.selo = selo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getNumDeMusicas() {
        return numDeMusicas;
    }

    public void setNumDeMusicas(int numDeMusicas) {
        this.numDeMusicas = numDeMusicas;
    }

    public int getSelo() {
        return selo;
    }

    public void setSelo(int selo) {
        this.selo = selo;
    }
    
    
}
