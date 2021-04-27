package Зачет.appliances;

public class Dryer extends SmallKitchen {
    private int p=250;
    private String color="White";
    private int active;
    private String name="Dryer";

    public Dryer(int active){
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
