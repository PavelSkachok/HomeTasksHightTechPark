package Зачет;

public class Problem6 {
    //Найти максимальный и минимальные элементы массива и вывести их индексы на экран
    public static void main(String[] args) {
       int n=6;
        int [] array=new int[n];
        for (int i=0;i<n;i++){
            array[i]=(int)(Math.random()*101);
        }
        int max=array[0],min=array[0],maxin=0,minin=0;
        for (int i=0;i<n;i++){
            if (array[i]>max){
                max=array[i];
                maxin=i;
            }
            if (array[i]<min){
                min=array[i];
                minin=i;
            }
        }
        for (int a:array){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("Максимальный элемент массива "+max+" и его индекс "+maxin);
        System.out.println("Минимальный элемент массива "+min+" и его индекс "+minin);
    }
}
