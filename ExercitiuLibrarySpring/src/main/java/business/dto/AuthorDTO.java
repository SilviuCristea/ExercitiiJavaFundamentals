package business.dto;

public class AuthorDTO {

    private String name;
    private String firstName;

    public AuthorDTO(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }
    public AuthorDTO(){

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

    @Override
    public String toString() {
        return "AuthorDTO{" +
                "name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
