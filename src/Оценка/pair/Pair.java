package Оценка.pair;

public class Pair <T,E> {
   private T a;
   private E b;

    public Pair(T a, E b) {
        this.a = a;
        this.b = b;
    }
    T first(){
        return a;
    }
    E last(){
        return b;
    }
     Pair<E,T> swap(){
        return new Pair<E,T>(b,a);
    }
    void replaceFirst(T a){
        this.a=a;
    }
    void replaceLast(E b){
        this.b=b;
    }
}
