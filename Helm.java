public class Helm {
    private String TypeOfLeather ;
    private double Diameter;

    public Helm(String TypeOfLeather, double Diameter){
        this.TypeOfLeather = TypeOfLeather;
        this.Diameter = Diameter;
    }

    public void setDiameter(double Diameter){
        this.Diameter = Diameter;

    }
    public void setTypeOfLeather(String TypeOfLeather){
        this.TypeOfLeather = TypeOfLeather;
    }

    public double getDiameter(){
        return Diameter;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "diameter=" + Diameter +
                ", typeOfLeather='" + TypeOfLeather + '\'' +
                '}';
    }

    public String getTypeOfLeather(){
        return TypeOfLeather;
    }
}
