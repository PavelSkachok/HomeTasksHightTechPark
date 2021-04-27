package Зачет.appliances;

public class WaffleMaker extends SmallKitchen {
    private int p=800;
    private String color="White";
    private int active;
    private String name="WaffleMaker";

    public WaffleMaker(int active){
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
