package Зачет.appliances;

public class Blender extends SmallKitchen {
    private int p=800;//Ватт
    private String color="White";
   private int active;
   private String name="Blender";

    public Blender(int active){
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
