package business.dto;

public class PersonDTO {
    private String name;
    private String firstName;
    private int yearOfBirth;

    public PersonDTO(String name, String firstName, int yearOfBirth) {
        this.name = name;
        this.firstName = firstName;
        this.yearOfBirth = yearOfBirth;
    }
    public PersonDTO(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
