package Оценка;

import java.util.Scanner;

public class Problem1 {
    /*Напишите программу,
    которая будет переводить секунды в форматированный вид - часы минуты секунды*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Введите количество секунд");
        int a=input.nextInt();
        int sec=a%60;
        int min=a/60%60;
        int hour1=a/3600;
        int hour=a/3600%24;
        int day=a/(3600*24)%7;
        int week=a/(3600*24*7);
        String z1="",z2="",z3="",z4="",z5="",z6="";
        if ((sec/10)!=1){
            switch (sec%10){
                case 1:z1=sec+" секунда";
                    break;
                case 2:
                case 3:
                case 4:z1=sec+" секунды";
                    break;

                default:z1=sec+" секунд";
            }
            if (sec/10==0&&sec%10==0){
                z1="";
            }
        }else  z1=sec+" секунд";


        if ((min/10)!=1){
            switch (min%10){
                case 1:z2=min+" минута ";
                    break;
                case 2:
                case 3:
                case 4:z2=min+" минуты ";
                    break;

                default:z2=min+" минут ";

            }
            if (min/10==0&&min%10==0){
                z2="";
            }
        }else z2=min+" минут ";

        if ((hour/10)!=1){
            switch (hour%10){
                case 1:z3=hour+" час ";
                    break;
                case 2:
                case 3:
                case 4:z3=hour+" часа ";
                    break;

                default:z3=hour+" часов ";

            }
            if (hour/10==0&&hour%10==0){
                z3="";
            }
        }else z3=hour+" часов ";

        if ((hour1/10)!=1){
            switch (hour1%10){
                case 1:z6=hour1+" час ";
                    break;
                case 2:
                case 3:
                case 4:z6=hour1+" часа ";
                    break;

                default:z6=hour1+" часов ";

            }
            if (hour1/10==0&&hour1%10==0){
                z6="";
            }
        }else z6=hour1+" часов ";

        if ((day/10)!=1){
            switch (day%10){
                case 1:z4=day+" день ";
                    break;
                case 2:
                case 3:
                case 4:z4=day+" дня ";
                    break;
//                case 0:z4="";
//                    break;
                default:z4=day+" дней ";

            }
            if (day/10==0&&day%10==0){
                z4="";
            }
        }else z4=day+" дней ";

        if ((week/10)!=1){
            switch (week%10){
                case 1:z5=week+" неделя ";
                    break;
                case 2:
                case 3:
                case 4:z5=week+" недели ";
                    break;
//                case 0:z5="";
//                    break;
                default:z5=week+" недель ";

            }
            if (week/10==0&&week%10==0){
                z5="";
            }
        }else z5=week+" недель ";

if (a==0){
    z1="0 секунд";
}
        System.out.println(z6+z2+z1);
        System.out.println(z5+z4+z3+z2+z1);

    }
}
