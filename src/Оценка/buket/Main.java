package Оценка.buket;

public class Main {
    public static void main(String[] args) {
        Buket buket1 = new Buket();
      buket1.addCvet(Flowers.GEORGIN);
        buket1.elemBuk();
        System.out.println("Стоимость всего букета "+buket1.stoimBuk()+" руб.");
        System.out.println("Букет завянет через "+buket1.srokLife()+" дн.");
    }
}
