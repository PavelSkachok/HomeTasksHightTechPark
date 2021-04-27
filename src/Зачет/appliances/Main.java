package Зачет.appliances;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        House[] house = new House[25];

        house[0] = new Blender(0);
        house[1] = new BreadMaker(0);
        house[2] = new Cave(0);
        house[3] = new Computer(1);
        house[4] = new DoubleBoiler(0);
        house[5] = new Dryer(0);
        house[6] = new Fireplace(0);
        house[7] = new GasBoiler(1);
        house[8] = new HometheaterChild(1);
        house[9] = new HomeTheaterParent(0);
        house[10] = new Iron(1);
        house[11] = new MeatGrinder(0);
        house[12] = new Microwave(0);
        house[13] = new MusicCenter(1);
        house[14] = new Pump(1);
        house[15] = new RecordPlayer(0);
        house[16] = new Refrigerator(1);
        house[17] = new SlowCooker(0);
        house[18] = new TvHor(0);
        house[19] = new TvLg(0);
        house[20] = new TvPanasonic(1);
        house[21] = new TvPanCh(0);
        house[22] = new VacuumCleaner(1);
        house[23] = new WaffleMaker(0);
        house[24] = new Xbox(1);


        int[] p=new int[25];
        int[] act=new int[25];
        String[] col=new String[25];
        String[] name=new String[25];

        for (int i=0;i<house.length;i++){
            p[i]=house[i].getP();
            act[i]=house[i].getActive();
            col[i]=house[i].getColor();
            name[i]=house[i].getName();
        }


        System.out.println("Потребляемая мощность включенных приборов "+House.power(p,act)+" Вт");
        System.out.println("Назовите параметр (цвет, мощность, имя), по которому необходимо отсортировать приборы");
        Scanner input=new Scanner(System.in);
        String arg=input.next();

        switch (arg){
            case "цвет":
                House.clr(col,name);
                break;
            case "мощность":
                House.pwsort(p,name);
                break;
            case "имя":
                String[] nm=House.nam(name);
                for (int i=0;i<name.length;i++){
                    System.out.println(nm[i]);
                }
                break;
        }
        int n=0;
        for (int i=0;i<house.length;i++){
            if (house[i]instanceof Kitchen){
                n++;
            }
        }//определение количества кухонных приборов

        Kitchen[] kitchens = new Kitchen[n];
        n=0;
        for (int i=0;i<house.length;i++){
            if (house[i]instanceof Kitchen){
                kitchens[n]=(Kitchen) house[i];
                n++;
            }
        }//формирование массива кухонных приборов
//     for (Kitchen i:kitchens){
//         System.out.println(i.getName());
//     }
     int pp=300;
     int on=1;
     String cvet="grey";
String z=Kitchen.poisk(pp,on,cvet,kitchens);
       if (z==""){
           System.out.println("Кухонного прибора с заданными параметрами в квартире нет");
       }else {System.out.println("Кухонные приборы с параметрами: "+" Мощность(Вт) P="+pp+" Цвет "+cvet+" Активность "+on+":");
           System.out.println(z);
       }
    }
}
