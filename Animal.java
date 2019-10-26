public class Animal {
    private String name;
    private int speed;
    private int years;

    public Animal(String name, int speed, int years){
        this.name = name;
        this.speed = speed;
        this.years = years;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getspeed(){
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getYears(){
        return years;
    }
    public void setYears(int years){
        this.years = years;
    }
    public String getter(){
        return "Name: " + name + "\nYears: " + years + "\nSpeed: " + speed;
    }


    public void setter(String name, int years, int speed){
        setYears(years);
        setName(name);
        setSpeed(speed);
}
}

