package Зачет.appliances;

public class Pump extends Service {
    private int p=3500;
    private String color="Silver";

    private int active;
    private String name="Pump";

    public Pump(int active){
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
