package Зачет.appliances;

public class BreadMaker extends SmallKitchen {
    private int p=550;
    private String color="White";
    private int active;
    private String name="BreadMaker";

    public BreadMaker(int active){
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
