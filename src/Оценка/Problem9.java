package Оценка;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//Даны 2 файла - in1.txt и in2.txt в каждом файле по 1000 чисел от 1 до 100000.
//Создайте файл out.txt, который будет содержать все отсортированные числа из файлов in1.txt и in2.txt.
//Файлы in1.txt и in2.txt можно создать с помощью кода.
public class Problem9 {
    public static void main(String[] args) {
        File in1 = new File("in1.txt");
        File in2 = new File("in2.txt");
int[] a=new int[1000];
int[] b=new int[1000];
        for (int i = 0; i < a.length; i++) {
            a[i]=(int)(Math.random()*100000+1);
            b[i]=(int)(Math.random()*100000+1);
        }

        try(FileWriter writer1 = new FileWriter(in1,false);
            FileWriter writer2 = new FileWriter(in2,false)) {
            for (int i = 0; i < a.length; i++) {
                String s1=Integer.toString(a[i]);
                String s2=Integer.toString(b[i]);
                writer1.write(s1);
                writer1.write(System.lineSeparator());
                writer2.write(s2);
                writer2.write(System.lineSeparator());
                }

            }catch (IOException e){
            e.printStackTrace();
        }
        ArrayList<Integer> arr=new ArrayList<>();
        try {
            FileReader reader1 = new FileReader("in1.txt");
            FileReader reader2 = new FileReader("in2.txt");
            Scanner sc1=new Scanner(reader1);
            Scanner sc2=new Scanner(reader2);

            while (sc1.hasNext()){
            arr.add(sc1.nextInt());}
            while (sc2.hasNext()){
                arr.add(sc2.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

       arr.sort(Integer::compareTo);

        File out=new File("out.txt");

            try(FileWriter writer3=new FileWriter(out,false)){
                for (int i = 0; i < arr.size(); i++) {
                String sot=Integer.toString(arr.get(i));
                writer3.write(sot);
                writer3.write(System.lineSeparator());}
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
