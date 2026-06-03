
package java7.pkg2q01;

public class Java72Q01 {

    public static void main(String[] args) {
        Fish f1 = new Fish("Amber", "AngelFish", 5);
        Fish f2 = new Fish("James", "Guppy", 3);
        Fish f3 = new Fish("Arthur", "Human", 6);
        String maisAmigavel = Fish.nicestFish(f1,f2);
        System.out.println(maisAmigavel);
    }
    
}
