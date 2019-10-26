public class Wheel {
    private double Diameter;
    private int TypeOfRubber;

    public Wheel(double Diameter, int TypeOfRubber){
        this.Diameter = Diameter;
        this.TypeOfRubber = TypeOfRubber;
    }

    public Wheel() {

    }

    public void setTypeOfRubber(int typeOfRubber){
        this.TypeOfRubber = typeOfRubber;
    }
    public void setDiameter(double diameter){
        this.Diameter = diameter;
    }
    public void increaseDiameter(int koef){
        if(koef > 0){
            Diameter *= koef;
            System.out.println("Diameter of wheels increase in: " + koef + " times");
        }
    }

    public int getTypeOfRubber(){
        return TypeOfRubber;
    }
    public double getDiameter(){
        return  Diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "typeOfRubber=" + TypeOfRubber +
                ", diameter=" + Diameter +
                '}';
}
}

