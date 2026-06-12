package inventário;
public class CD extends Produto {
    private String artista;
    private int numDeMusicas;
    private String selo;

    public CD(String artista, int numDeMusicas, String selo, int numeroItem, int qtdEstoque, String nomeProd, double precoItem, String ativo) {
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

    public String getSelo() {
        return selo;
    }

    public void setSelo(String selo) {
        this.selo = selo;
    }
    @Override
    public String toString() {
        return "\nNumero: " + getNumeroItem() + "\nQuantidade em estoque: " + getQtdEstoque() + "\nNome do produto: " +
                "CD" + "\nPreco do item: " + getPrecoItem() + "\nAtivo? " + getAtivo() + "\nArtista = " 
                + artista + "\nNumero de Musicas = " + numDeMusicas
                + "\nSelo = " + selo;
    }
    
}
