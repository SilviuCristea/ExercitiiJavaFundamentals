public class Catalog {

    private String className;

    private Catalog(){
    }
    private static Catalog instance = new Catalog();

    public static Catalog getInstance(){
        return instance;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
