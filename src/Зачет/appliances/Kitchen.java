package Зачет.appliances;

public abstract class Kitchen extends House {
    static String poisk(int power,int onOff,String color,Kitchen[] array){
        String z="";
        for (int i=0;i<array.length;i++){
            if (power==array[i].getP() && onOff==array[i].getActive()&& color.equalsIgnoreCase(array[i].getColor()) ){
                z=z.join(", ",array[i].getName()) ;
            }
        }
        return z;
    }
}
