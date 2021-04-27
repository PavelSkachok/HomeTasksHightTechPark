package Зачет.appliances;

public class Microwave extends LargeKitchen {
    private int p = 1500;
    private String color = "Black";
    private int active;
    private String name="Microwave";

    public Microwave(int active){
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
