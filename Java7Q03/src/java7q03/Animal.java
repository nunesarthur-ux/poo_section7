package java7q03;
public class Animal {
    int weight, height;
    double speed, time, miles;
    public Animal() {
        weight = 50;
        height = 4;
        speed = 2; //miles per hour
    }
    public Animal(int w, int h, int s ) {
        this.weight = w;
        this.height = h;
        this.speed = s;
    }
    public double getTime() { //gets the number of hours to go these
        return miles/speed;
    }
    public int getWeight() {
        return weight;
    }
    public int getHeight() {
        return height;
    }
    public double getSpeed() {
        return speed;
    }
    
}
