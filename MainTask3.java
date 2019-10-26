public class MainTask3 {
    public static void main(String ...args){
        Animal animal = new Animal("Loepard",20,7);
        System.out.println(animal.getter());
        animal.setter("bull",14 , 2 );
        System.out.println(animal.getter());
    }
}
