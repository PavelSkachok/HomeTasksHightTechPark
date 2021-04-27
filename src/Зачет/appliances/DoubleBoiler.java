package Зачет.appliances;

public class DoubleBoiler extends SmallKitchen {
    private int p=1800;
    private String color="White";
    private int active;
    private String name="DoubleBoiler";

    public DoubleBoiler(int active){
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
