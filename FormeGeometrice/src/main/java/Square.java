public class Square extends Shape implements Calculable{

    public String draw (){
        return "Desenez un patrat";
    }


    public String perimeter() {
        return "Se calculeaza perimetrul patratului";
    }

    public String area() {
        return "Se calculeaza aria patratului";
    }
}
