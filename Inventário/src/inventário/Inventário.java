package inventário;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Inventário {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int tempQtd;
        int tempMenu;
        tempQtd = getNumProducts(in);
        if (tempQtd == 0){
            System.out.println("Nao ha produtos");
        }
        
        else{
            Produto[] produtos = new Produto[tempQtd];
            for(int i = 0; i < produtos.length; i++){
                addToInventory(produtos,in,i);
            }
            do{
                tempMenu = getMenuOption(in);
                for(int i = 0; i < produtos.length; i++){
                    executeMenuChoice(tempMenu,produtos,in,i);
                }
            }while(tempMenu != 0);
        }
        in.close();    
    }
    
    
    
    public static void displayInventory(Produto[]p){
       for (Produto produt : p) {
                System.out.println(produt);
            } 
    }
    public static void addToInventory(Produto[]p, Scanner in,int i){
        int tempoNum;
        int tempEstoque;
        String tempNome;
        double tempPreco;
        String tempAtivo;
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
    
    public static void addCDToInventory(Produto[]p, Scanner in, int i){
        int tempoNum;
        int tempEstoque;
        String tempNome;
        double tempPreco;
        String tempAtivo;
        String tempArtista;
        int tempNumDeMusicas;
        String tempSelo;
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
                System.out.println("Artista: ");
                tempArtista = in.nextLine();
                System.out.println("Numero de musicas: ");
                tempNumDeMusicas = in.nextInt();
                System.out.println("Selo: ");
                tempSelo = in.nextLine();
                p[i] = new CD(tempArtista,tempNumDeMusicas,tempSelo,tempoNum,tempEstoque,tempNome,tempPreco,tempAtivo);
    }
    
    public static void addDVDToInventory(Produto[]p, Scanner in, int i){
        int tempoNum;
        int tempEstoque;
        String tempNome;
        double tempPreco;
        String tempAtivo;
        int tempDuracaoFilme;
        int tempClassificacaoEtaria;
        String tempEstudioCinematografico;
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
                System.out.println("Duracao: ");
                tempDuracaoFilme = in.nextInt();
                System.out.println("Classificacao indicativa: ");
                tempClassificacaoEtaria = in.nextInt();
                System.out.println("Estudio produtor: ");
                tempEstudioCinematografico = in.nextLine();
                p[i] = new DVD(tempDuracaoFilme,tempClassificacaoEtaria,tempEstudioCinematografico,tempoNum,tempEstoque,tempNome,tempPreco,tempAtivo);
    }
    
    public static int getNumProducts(Scanner in){
        int tempQtd = -1;
        while(tempQtd < 0){
        try{

            System.out.println("Insira o numero de produtos:");
            tempQtd = in.nextInt();
            if(tempQtd < 0){
                System.out.println("Digite um valor positivo");
                }
            }
        catch(InputMismatchException e){
            System.out.println(
                "Digite apenas numeros.");
            in.nextLine();
            }
        }
        return tempQtd;
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
                System.out.println("Insira um numero: ");
                tempMenu =in.nextInt();
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
    
    public static int getProductNumber(Produto[]p, Scanner in){
        int productChoice = -1;
        for(int i = 0; i < p.length ; i++){
            System.out.println("Opcao " + i + " - " + p[i].getNomeProd());
        }
        while(productChoice < 0 || productChoice >= p.length){
            try{
                productChoice = in.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Digite um indice valido ");
                System.out.println("Escolha um produto");
                in.nextLine();
            }
        }
        return productChoice;
    }
    
    public static void addInventory(Produto[]p, Scanner in, int i){
        int stockChoice = -1;
        while(stockChoice < 1 || stockChoice > 2){
            try{
                System.out.println("1: CD");
                System.out.println("2: DVD");
                System.out.print("Insira o tipo de produto: ");
                stockChoice = in.nextInt();

                if(stockChoice < 1 || stockChoice > 2){
                    System.out.println("Somente os números 1 ou 2 são permitidos!");
                }
            }
        catch(InputMismatchException e){

            System.out.println("Digite apenas números.");

            in.nextLine();

            stockChoice = -1;
            }
        }
        if(stockChoice == 1){

            addCDToInventory(p,in,i);
        }
        else{
            addDVDToInventory(p,in,i);
        }
    }
    
    public static void deductInventory(Produto[]p, Scanner in){
        int productChoice;
        int updateValue = -1;
        productChoice = getProductNumber(p,in);
        while(updateValue < 0){
            try{
                System.out.println("Quantos produtos deseja deduzir? ");
                updateValue = in.nextInt();
                if(updateValue < 0){
                    System.out.println("Digite um valor maior ou igual a zero.");
                }
                
            }
            catch(InputMismatchException e){
                System.out.println("Digite uma quantia valida");
                in.nextLine();
            }
        }
        p[productChoice].deductFromInventory(updateValue);
        
    }
    
    public static void discontinuelInventory(Produto[]p, Scanner in){
        int productChoice = getProductNumber(p,in);
        p[productChoice].setAtivo("desativado");
        
    }
    
    public static void executeMenuChoice( int getMenuOption,Produto[]p, Scanner in, int i){
        switch(getMenuOption){
                case 1:
                    System.out.println("\n == Exibir inventario == ");
                    displayInventory(p);
                    break;
                case 2:
                    System.out.println("\n== Adicionar Estoque ==");
                    addInventory(p,in,i);
                    break;
                case 3:
                    System.out.println("\n == Deduzir Estoque == ");
                    deductInventory(p,in);
                    break;
                case 4:
                    System.out.println("\n == Descontinuar produto ==");
                    discontinuelInventory(p,in);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
            }
        
    }
}
    
