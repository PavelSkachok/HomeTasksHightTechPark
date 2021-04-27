package Зачет.appliances;

public class MeatGrinder extends SmallKitchen {
    private int p=1400;
    private String color="Black";
    private int active;
    private String name="MeatGrinder";

    public MeatGrinder(int active){
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
