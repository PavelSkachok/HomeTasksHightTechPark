package Зачет.appliances;

public class Refrigerator extends LargeKitchen {
    private int p=300;
    private String color="Grey";
    private int active;
    private String name="Refrigerator";

    public Refrigerator(int active){
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
