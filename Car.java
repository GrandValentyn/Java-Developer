public class Car {
    private final Carcase Wheel;
    private Carcase carcase;
    private Helm helm;
    private Wheel wheel;
    private String Number;
    private String Model;
    private int Year;
    public Car(Wheel carcase, Helm helm, Carcase Wheel, String Number, String Model, int Year){
        this.carcase = (Carcase) carcase;
        this.helm = helm;
        this.Model = Model;
        this.Number = Number;
        this.Wheel = Wheel;
        this.Year = Year;
    }
    public void setWheel(Wheel wheel){
        this.wheel = wheel;
    }

    public void update(){
        wheel.increaseDiameter(3);
        helm.setDiameter( helm.getDiameter() + 5);
        carcase.setHeight(carcase.getHeight() + 20);

    }

    @Override
    public String toString() {
        return "\nCar{" +
                "wheel=" + wheel +
                ", helm=" + helm +
                ", carcase=" + carcase +
                ", \nyear=" + Year +
                ", model='" + Model + '\'' +
                ", number='" + Number + '\'' +
                "}\n";
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        this.Year = year;
    }

   public Wheel getCarcase() {
        return carcase;
    }

    public void setCarcase(Carcase carcase) {
        this.carcase = carcase;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        this.Number = number;
    }

}
