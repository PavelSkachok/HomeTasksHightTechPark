package Оценка.pair;

public class Main {
    public static void main(String[] args) {
        Pair<Object, Object> pair1 = new Pair<>("Pasha", 10);
        Pair<Object, Object> pair2 = pair1.swap();
        System.out.println(pair1.first());
        System.out.println(pair1.last());
        System.out.println(pair2.first());
        System.out.println(pair2.last());

        pair1.replaceFirst("Masha");
        System.out.println(pair1.first());
        pair1.replaceLast(25);
        System.out.println(pair1.last());
    }
}
