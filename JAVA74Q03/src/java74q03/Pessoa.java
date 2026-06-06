package java74q03;
import java.util.Date;
public class Pessoa {
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;
    public Pessoa (String firstName, String middleName, String lastName, Date dateOfBirth){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName(){
        return firstName + " " + middleName + " " + lastName;
    }
    
    
}
