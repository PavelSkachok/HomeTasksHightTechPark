package Оценка.map;

public class Main {
    public static void main(String[] args) {
        String[] a={"Animal","Bird","Cow","Cat","Bird","Dog","Cat","Cat","Animal","Cat","Cat"};
        Integer[] b={1,2,3,3,0,5,4,2,2,2,1,0};

        System.out.println( MapProbl.arrayToMap(a));
        System.out.println( MapProbl.arrayToMap(b));

    }
}
