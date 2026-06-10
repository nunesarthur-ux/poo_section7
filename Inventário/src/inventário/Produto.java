package inventário;
public class Produto {
    //Variáveis de instância
    private int numeroItem;
    private int qtdEstoque;
    private String nomeProd;
    private double precoItem;
    private String ativo;
    
    // inicializar os campos com seus valores padrão
    public Produto() {
    }
    // inicializados sem valores da classe do driver
    public Produto(int numeroItem, int qtdEstoque, String nomeProd, double precoItem, String ativo) {
        this.numeroItem = numeroItem;
        this.qtdEstoque = qtdEstoque;
        this.nomeProd = nomeProd;
        this.precoItem = precoItem;
        this.ativo = ativo;
    }
    
    //métodos acessores e modificadores
    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }
    
    public String getAtivo() {
       return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }
    
    public double getValorEstoque(){
        return (double)qtdEstoque * precoItem;
    
    }

    @Override
    public String toString() {
        return  "\n Numero do item = " + numeroItem + "\n Quantidade em estoque = " + qtdEstoque +
        "\n Nome do produto = " + nomeProd + "\n Preco do item = " + precoItem + "\n Status do Produto: " + ativo +
        "\nValor do estoque: " +getValorEstoque();
    }
}
   
