package java7q04;
public class Student {
    private String name;
    private int credits;
    private int qualityPoints;
    private double media;
    
    public Student (String name, int credits, int qualityPoints){
        this.name = name;
        this.credits = credits;
        this.qualityPoints = qualityPoints;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public int getQualityPoints() {
        return qualityPoints;
    }

    public double getMedia() {
        double m = qualityPoints/media;
        return m;
    }
    
    
}
