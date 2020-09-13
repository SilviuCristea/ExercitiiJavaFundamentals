package business.dto;

public class SectionDTO {
    private String name;

    public SectionDTO(String name) {
        this.name = name;
    }
    private SectionDTO(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SectionDTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
