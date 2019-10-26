public class MainTask2 {
    public static void main(String ...args){

        Wheel wheel = new Wheel(17,30);
        Helm helm = new Helm("", 20);
        Carcase carcase = new Carcase(210 , 650, 170 );

        Car car = new Car(wheel, helm, carcase, "AA7777AA", "X6", 2017);

        System.out.println(car.getCarcase());
        System.out.println(car.getHelm());
        System.out.println("Model: " + car.getModel());
        System.out.println("Number: " + car.getNumber());
        System.out.println(car.getWheel());
        System.out.println("Year: " + car.getYear());
        System.out.println(car);
        System.out.println(car);
        car.update();
        System.out.println(car);

    }
}
