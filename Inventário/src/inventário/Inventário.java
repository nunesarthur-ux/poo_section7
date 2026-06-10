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
        int tempMenu;
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
        Produto[] produtos = new Produto[tempQtd];
        if (tempQtd == 0){
            System.out.println("Nao ha produtos");
        }
        
        
        else{
            addToInventory(produtos,in);
        }
        
        do{
            tempMenu = getMenuOption(in);
            switch(tempMenu){
                case 1:
                    displayInventory(produtos);
                    break;
                case 2:
                    produtos[1].addToInventory(3);
                    break;
                case 3:
                    produtos[1].deductFromInventory(3);
                    break;
                case 4:
                    produtos[1].setAtivo("desativado");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
            }
        }while(tempMenu != 0);
        
         System.out.println("\n======= PRODUTOS CADASTRADOS =======");
         displayInventory(produtos);
        in.close();    
    }
    
    
    
    public static void displayInventory(Produto[]p){
       for (Produto produt : p) {
                System.out.println(produt);
            } 
    }
    public static void addToInventory(Produto[]p, Scanner in){
        int tempoNum;
        int tempEstoque;
        String tempNome;
        double tempPreco;
        String tempAtivo;
        for (int i = 0; i < p.length; i++){
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
                p[i] = produto;
        }
    }
    public int getNumProducts(Produto[]p){
        return p.length;
    }
    public static int getMenuOption(Scanner in){
        int tempMenu = -1;
        while(tempMenu < 0 || tempMenu > 4){
            try{
                System.out.println("1.Exibir Inventário");
                System.out.println("2.Adicionar Estoque");
                System.out.println("3.Deduzir Estoque");
                System.out.println("4.Descontinuar Produto");
                System.out.println("0.Sair");
                if (tempMenu < 0 || tempMenu > 4){
                    System.out.println("INVALIDO!");
                }
            }
            catch(InputMismatchException e){
                System.out.println("Digite so numeros.");
                in.nextLine();
                tempMenu = -1;
                
            }
        }
        return tempMenu;
    }
}
    
