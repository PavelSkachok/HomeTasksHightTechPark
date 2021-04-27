package Зачет;

public class Problem7 {
    //Создать массив заполнить его случайными элементами, распечать, перевернуть, и снова распечатать
    public static void main(String[] args) {
        int n=10;
        int[] kkk=new int[n];
        for (int i=0;i<n;i++){
            kkk[i]=(int)(Math.random()*1000-500);
        }//заполнение массива случайными числами
        for (int a:kkk){
            System.out.print(a+" ");
        }//вывод массива на экран
        int b;
        for (int i=0;i<n/2;i++){
            b=kkk[n-1-i];
            kkk[n-1-i]=kkk[i];
            kkk[i]=b;
        }//переворот массива
        System.out.println();
        for (int m:kkk){
            System.out.print(m+" ");
        }//вывод массива на экран
    }
}
