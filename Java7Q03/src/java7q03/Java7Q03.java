package java7q03;
public class Java7Q03 {
    public static void main(String[] args) {
        Animal a1 = new Animal(2,3,5);
        Animal a2 = new Animal();
        System.out.println("O animal a1 tem velocidade de " +a1.getSpeed() + "Km/h");
        System.out.println("O animal 2 tem vel de " + a2.getSpeed() + "Km/h");
    }
    
}
