package Оценка;

public class Problem5 {
    /*Имеется строка с текстом.
Подсчитайте уникальное количество слов в тексте.
Учитывайте, что слова могут разделяться несколькими пробелами, знаками препинания.
Пробелы могут присутствовать в начале и конце текста.
*/
    public static void main(String[] args) {
        String a = "Listen to the news from today and read the text at the same time. Listen to the news from today without reading the text.";
       int n=numword(a);

        System.out.println();
        System.out.println("Количество уникальных слов во фразе: "+n);
        }
    static int numword(String a){
        String[] symb = {"!", "?", ".", ",", ":", ";","-"};
        for (int i = 0; i < symb.length; i++) {
            if (a.contains(symb[i])) {
                a = a.replace(symb[i], " ");
            }
        }//идентификация знаков препинания и замена их на пробел
        String[] b = a.split("\\s");// разделение строки на массив строк

        int c = 0;
        String d = "";
        for (int i = 0; i < b.length; i++) {
            if (!b[i].equals("")) {
                c++;
                d = String.join(" ", d, b[i]);
            }
        }//определение количества слов во фразе и формирование строки из слов, разделенных одним пробелом
        String[] f = d.split("\\s");//получение массива строк

        int k ;
        int[] m=new int[c];
        for (int i = 1; i < f.length; i++) {
            k=0;
            for (int j = i; j < f.length; j++) {
                if (f[j].equalsIgnoreCase(f[i])) {
                    k++;
                    m[i-1]=k;
                }
            }
        }//формирование массива количества каждого слова во фразе
        int v=0;
        for (int i=0;i<m.length;i++){
            if (m[i]==1){
                v++;
            }
        }//определение количества уникальных слов
        return v;
    }
    }

