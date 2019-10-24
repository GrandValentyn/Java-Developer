public class main {
    public static void main(String[] args) {
        int S,P;

  Rectangle rectangle;

  rectangle = new Rectangle(10,12);
        System.out.println("Rectangle width is " + rectangle.width + " and length" + rectangle.length);
        S = (rectangle.width * rectangle.length);
        P = (rectangle.width + rectangle.length );
        System.out.println("Площа прямокутника" + S);
        System.out.println("Периметр прямокутника"+ P);


    }
}
