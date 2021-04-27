package Зачет;

import java.util.Scanner;

public class Problem2 {
    // Напишите программу расчета даты следующего дня введя 3 числа - день месяц и год
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите день");
        int a=in.nextInt(),a1;
        System.out.println("Введите месяц");
        int b=in.nextInt(),b1;
        System.out.println("Введите год");
        int c=in.nextInt(),c1=c;

        if (b>12||(a>31&&((b % 2 == 1 && b <= 7) || (b % 2 == 0 && b > 7 && b <= 12)))||(a>30&&((b % 2 == 0 && b <= 7) || (b % 2 == 1 && b > 7 && b <= 12)))||(a>28&&(b==2)&&(c%4!=0))||(a>29&&(b==2)&&(c%4==0))){
            System.out.println("Такого дня не существует");
        }else {
            if ((b % 2 == 1 && b <= 7) || (b % 2 == 0 && b > 7 && b < 12)) {
                if (a == 31) {
                    a1 = 1;
                    b1 = b + 1;
                } else {
                    a1 = a + 1;
                    b1 = b;
                }
            } else if (a == 30) {
                a1 = 1;
                b1 = b + 1;
            } else {
                a1 = a + 1;
                b1 = b;
            }
            if (c%4==0){
                if (b==2&&a==29){a1=1;
                    b1=3;
                }
            }else if (b==2&&a==28){a1=1;
                b1=3;//Проверка на високосный год
            }
            if (a==31&&b==12){a1=1;
                b1=1;
                c1=c+1;}//последний день года
            System.out.println("Дата следующего дня: "+a1+" "+b1+" "+c1);
        }
    }
}
