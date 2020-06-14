public class Group {

    private String name;

    private Group(){
    }
    private static Group instance = new Group();

    public static Group getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
