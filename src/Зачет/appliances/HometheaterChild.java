package Зачет.appliances;

public class HometheaterChild extends Entertainment {
    private int p=1000;
    private String color="Black";

    private int active;
    private String name="HometheaterChild";

    public HometheaterChild(int active){
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
