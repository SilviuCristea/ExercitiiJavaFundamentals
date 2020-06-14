public class Main {
    public static void main(String[] args) {

        Circle cerc = new Circle();

        Rectangle dreptunghi = new Rectangle();

        Square patrat = new Square();

        System.out.println(cerc.draw());

        System.out.println(dreptunghi.draw());

        System.out.println(patrat.draw());

        Shape cerc1 = new Circle();

        Shape dreptunghi1 = new Rectangle();

        Shape patrat1 = new Square();

        System.out.println(cerc1.draw());

        System.out.println(dreptunghi1.draw());

        System.out.println(patrat1.draw());

        System.out.println(cerc.perimeter());
        System.out.println(cerc.area());

        Calculable cerc2 = new Circle();
        Calculable dreptunghi2 = new Rectangle();
        Calculable patrat2 = new Square();

        System.out.println(dreptunghi2.perimeter());
        System.out.println(patrat2.area());



    }
}
