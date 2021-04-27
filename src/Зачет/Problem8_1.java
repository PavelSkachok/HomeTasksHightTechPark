package Зачет;

import java.util.Scanner;

public class Problem8_1 {
    //Найти в строке все знаки препинания.
    //Подсчитать общее количество их.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Введите фразу");
        String a=input.nextLine();

        punctual(a);


    }
    static void punctual(String arg){
        int b=arg.length(),d=0;
        char[] c=arg.toCharArray();;
        char[] f=new char[b];



        for (int i=0;i<b;i++){
            if (c[i] == ',' || c[i]=='.'||c[i]=='!'||c[i]=='?'||c[i]=='-'||c[i]==':'||c[i]==';') {
                f[d]=c[i];
                d++;
            }
        }//поиск знаков препинания и формирование массива знаков препинания
        if (d==0){
            System.out.println("В строке нет знаков препинания");
        }else {
            System.out.println("Все знаки препинания, встречающиеся в строке:");
            for (char i:f){
                System.out.print(i+" ");
            }
            System.out.println();
            System.out.println("Количество знаков препинания: "+d);
        }// вывод на экран знаков препинания


    }
}
