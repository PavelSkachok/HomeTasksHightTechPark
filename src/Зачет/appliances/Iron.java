package Зачет.appliances;

public class Iron extends Service {
    private int p=2500;
    private String color="Pink";
    private int active;
    private String name="Iron";

    public Iron(int active){
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
