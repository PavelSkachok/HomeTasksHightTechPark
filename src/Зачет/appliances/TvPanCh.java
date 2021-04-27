package Зачет.appliances;

public class TvPanCh extends Entertainment {
    private int p=500;
    private String color="Black";
    private int active;
    private String name="TvPanCh";

    public TvPanCh(int active){
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
