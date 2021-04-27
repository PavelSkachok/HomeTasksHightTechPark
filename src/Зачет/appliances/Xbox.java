package Зачет.appliances;

public class Xbox extends Entertainment {
    private int p=120;
    private String color="Green";
    private int active;
    private String name="Xbox";

    public Xbox(int active){
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
