package inventário;
public class DVD extends Produto {
    private int duracaoFilme;
    private int classificacaoEtaria;
    private String estudioCinematografico;

    public DVD(int duracaoFilme, int classificacaoEtaria, String estudioCinematografico, 
            int numeroItem, int qtdEstoque, String nomeProd, double precoItem, String ativo) {
        super(numeroItem, qtdEstoque, nomeProd, precoItem, ativo);
        this.duracaoFilme = duracaoFilme;
        this.classificacaoEtaria = classificacaoEtaria;
        this.estudioCinematografico = estudioCinematografico;
    }
    
    @Override
    public double getValorEstoque(){
        return (double) super.getQtdEstoque() * super.getPrecoItem() * 1.05;
    
    }

    public int getDuracaoFilme() {
        return duracaoFilme;
    }

    public void setDuracaoFilme(int duracaoFilme) {
        this.duracaoFilme = duracaoFilme;
    }

    public int getClassificacaoEtaria() {
        return classificacaoEtaria;
    }

    public void setClassificacaoEtaria(int classificacaoEtaria) {
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public String getEstudioCinematografico() {
        return estudioCinematografico;
    }

    public void setEstudioCinematografico(String estudioCinematografico) {
        this.estudioCinematografico = estudioCinematografico;
    }

    @Override
    public String toString() {
        return "\nNumero do item: " + getNumeroItem() + "\nQuantidade em estoque: " + getQtdEstoque() + "\nNome do produto: " +
                "DVD" + "\nPreco do item: " + getPrecoItem() + "\nAtivo? " + getAtivo() + "\nDuracaoFilme = " 
                + duracaoFilme + "\nClassificacaoEtaria = " + classificacaoEtaria
                + "\nEstudioCinematografico = " + estudioCinematografico;
    }
    
    
    
    
}
