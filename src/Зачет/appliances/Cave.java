package Зачет.appliances;

public class Cave extends LargeKitchen {
    private int p=2450;
    private String color="Black";
    private int active;
    private String name="Cave";

    public Cave(int active){
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
