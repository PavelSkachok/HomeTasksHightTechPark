package Зачет.appliances;

public class SlowCooker extends SmallKitchen {
    private int p=1600;
    private String color="Orange";
    private int active;
    private String name="SlowCooker";

    public SlowCooker(int active){
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
