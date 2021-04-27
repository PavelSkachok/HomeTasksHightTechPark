package Оценка;

import java.util.Scanner;

public class Problem4 {
    /*Создать двумерный квадратный массив размера n.
Заполнить его случайными числами таким образом:

числа по диагонали равны 0;
вверху и снизу от пересечения диагоналей находятся только положительные числа;
слева и справа от пересечения диагоналей находятся только отрицательные числа;

Вывести массив на экран.

Найти сумму всех элементов
Найти среднее арифметическое всех элементов, которые больше суммы всех элементов


Пример:
 0  4  5  5  3  8  0
-2  0  5  6  3  0 -4
-2 -8  0  6  0 -1 -2
-5 -9 -2  0 -9 -7 -3
-6 -2  0  1  0 -1 -5
-2  0  3  5  2  0 -8
 0  4  2  9  1  3  0*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Введите размерность квадратной матрицы");
        int n=input.nextInt();
        int[][] a=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if ((j>i && j<n-i-1)||(j<i && j>n-1-i)){
                    a[i][j]=(int )(Math.random()*10+1);
                }else {
                    a[i][j]=(int)(Math.random()*(-10)-1);
                }
                a[i][i]=0;
                a[i][n-1-i]=0;
                System.out.printf("%4d",a[i][j]);
            }
            System.out.println();
        }//создание требуемого массива и вывод его на экран
        int s=elemtsum(a);//вызов метода
        System.out.println("Сумма всех элементов матрицы: "+s);
        double s2=sredn(a,s);
    }
    //решим данную задачу через методы
    static int elemtsum (int[][] arr){
        int n=arr.length;
        int sum=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    static double sredn(int[][] arr,int b){
        int n=arr.length;
        double sum2=0;
        int m=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (arr[i][j]>b){
                    sum2+=arr[i][j];
                    m++;
                }
            }
        }
        double c=0;
        if (m==0){
            System.out.println("В матрице нет элементов, больших "+b);
        }else {
            c=sum2/m;
            System.out.printf("Среднее арифметическое элементов, больших %d = %.3f \n",b,c);
        }
        return c;
    }
}
