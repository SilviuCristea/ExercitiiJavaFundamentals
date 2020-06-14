import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String department;

    public Employee (String name, String surname, String department){
        this.name=name;
        this.surname=surname;
        this.department=department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getSurname() {
        return surname;
    }

    public String toString(){
        return this.name+" "+this.surname+" "+this.department;
    }

    public boolean equals(Employee o) {
        if(this.name.equals(o.getName()) && this.surname.equals(o.getSurname()) && this.department.equals(o.getDepartment())){
            return true;
        }else{
            return false;
        }

    }

    public int hashCode() {
        return this.name.length()+this.surname.length()+this.department.length();
    }


}
