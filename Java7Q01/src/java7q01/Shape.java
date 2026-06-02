package java7q01;
public class Shape {
    int test = 0;
    private int numSides;
    private boolean regular;
    
    public Shape(){
        this.numSides = 0;
        this.regular = false;
    }

    public Shape(int numSides, boolean regular) {
        this.numSides = numSides;
        this.regular = regular;
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }
    
    
    
    
}
