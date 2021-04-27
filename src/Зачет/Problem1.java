package Зачет;

import java.util.Scanner;

public class Problem1 {
    /*Имеется прямоугольное отверстие размера a на b.
    Определить можно ли полностью закрыть отверстие круглой картонкой радиусом r*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Длина прямоугольника");
        double a=input.nextDouble();
        System.out.println("Ширина прямоугольника");
        double b=input.nextDouble();
        System.out.println("Радиус круга");
        double r=input.nextDouble();
        double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));//Определение длины диагонали
        if (c<=2*r){
            System.out.println("Картонка с радиусом "+r+" закрывает полностью отверстие размером "+a+"*"+b);
        }else System.out.println("Картонка с радиусом "+r+" не закрывает полностью отверстие размером "+a+"*"+b);

    }
}
