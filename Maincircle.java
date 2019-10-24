public class Maincircle {
    public static void main(String[] args) {
        double S, l,P;
        P = 3.14;

        Circle circle;
        circle = new Circle(5.0,2.5);

        S = ((circle.r*circle.r)*P);
        System.out.println("Площа кола"+ S);
        l = (2*P*circle.r);
        System.out.println("Довжина кола" + l);

    }
}