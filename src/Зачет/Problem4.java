package Зачет;

import java.util.Scanner;

public class Problem4 {
    //Для введенного целого числа определить является ли это число простым
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите число a");
        int a=in.nextInt(),b,i=2;
        if (a<=1){
            System.out.println("Введенное число не входит в область определения простых чисел");
        }else {
            do {
                b=a%i;
                i++;
            }while (b!=0&&i<a);
            if (b==0&&a!=2){
                System.out.println("Число "+a+" составное");
            }else System.out.println("Число "+a+" простое");
        }
    }
}
