package java74q03;
public class Student {
    private int idStudent;
    private double mediaStudent;
    private String studentCareer;
    public String studentDegree;
    public int yearOfGraduation;

    public int getIdStudent() {
        return idStudent;
    }

    public double getMediaStudent() {
        return mediaStudent;
    }

    public String getStudentCareer() {
        return studentCareer;
    }

    public void setStudentCareer(String studentCareer) {
        this.studentCareer = studentCareer;
    }
    
    public double calcularMedia(String[] notas) {
    double soma = 0;
    for (String nota : notas) {
        switch (nota) {
            case "A":
                soma += 4.0;
                break;
            case "A-":
                soma += 3.67;
                break;
            case "B+":
                soma += 3.33;
                break;
            case "B":
                soma += 3.0;
                break;
            case "B-":
                soma += 2.67;
                break;
            case "C+":
                soma += 2.33;
                break;
            case "C":
                soma += 2.0;
                break;
            case "D":
                soma += 1.0;
                break;
            case "F":
                soma += 0.0;
                break;
        }
    }
    return soma / notas.length;
}
    
    
    
    
}
