package inventário;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Inventário {
    public static void main(String[] args) {
         Scanner in = new Scanner (System.in);
        int tempoNum;
        int tempEstoque;
        String tempNome;
        double tempPreco;
        String tempAtivo;
        int tempQtd = -1;
        int MaxSize = -1;
        Produto[] produtos = new Produto[10];

        while(tempQtd < 0){
            try {
                System.out.println("Insira o numero de produtos que deseja adicionar "
                + "Ou insira zero(0) caso nao queira acrescentar produto\"); : ");
                tempQtd = in.nextInt();
                if(tempQtd < 0){
                    System.out.println("Escreva um num positivo");
                } 
            }
            catch(InputMismatchException e){
                System.out.println("Você inseriu outro tipo de dado");
                in.nextLine();
            }
        }
        if (tempQtd == 0){
            System.out.println("Nao ha produtos");
        }
        else{
            for (int i = 0; i < produtos.length; i++){
                in.nextLine();
                System.out.println("Insira o numero do item: ");
                tempoNum = in.nextInt();
                System.out.println("Insira a quantidade em estoque: ");
                tempEstoque = in.nextInt();
                in.nextLine();
                System.out.println("Insira o nome do produto: ");
                tempNome = in.nextLine();
                System.out.println("Valor do produto: ");
                tempPreco = in.nextDouble();
                in.nextLine();
                System.out.println("Status do produto: ");
                tempAtivo = in.nextLine();
                Produto produto = new Produto(tempoNum, tempEstoque, tempNome, tempPreco, tempAtivo);
                produtos[i] = produto;
                
            }
        }
         System.out.println("\n======= PRODUTOS CADASTRADOS =======");

        for (Produto produt : produtos) {

            System.out.println(produt);
        }
        in.close();    
    }
}
    
