public class Main {
    public static void main(String[] args) {

        //Inceput de clasa a noua

        Group group =Group.getInstance();

        Catalog catalog = Catalog.getInstance();

        group.setName("Clasa a 9a B");

        catalog.setClassName("Catalogul clasei a 9a B");

        Catalog catalog1=Catalog.getInstance();
        Group group1 = Group.getInstance();

        System.out.println("Clasa 1 este: "+group.getName());
        System.out.println("Catalogul pentru clasa 1 este: "+catalog.getClassName());
        System.out.println("Clasa 2 este: "+group1.getName());
        System.out.println("Catalogul pentru clasa 2 este: "+catalog1.getClassName());

        System.out.println();

        group.setName("Clasa a 10a B");

        catalog.setClassName("Catalogul clasei a 10a B");

        System.out.println("Clasa 1 este: "+group.getName());
        System.out.println("Catalogul pentru clasa 1 este: "+catalog.getClassName());
        System.out.println("Clasa 2 este: "+group1.getName());
        System.out.println("Catalogul pentru clasa 2 este: "+catalog1.getClassName());


    }
}
