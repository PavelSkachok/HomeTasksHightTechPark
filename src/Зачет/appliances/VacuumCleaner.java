package Зачет.appliances;

public class VacuumCleaner extends Service {
    private int p=2000;
    private String color="Magenta";
    private int active;
    private String name="VacuumCleaner";

    public VacuumCleaner(int active){
        this.active=active;
        if (active == 1) {
            System.out.println("Включен "+name);
        }
    }

    public int getP() {
        return p;
    }

    public String getColor() {
        return color;
    }

    public int getActive() {
        return active;
    }

    public String getName() {
        return name;
    }
}
