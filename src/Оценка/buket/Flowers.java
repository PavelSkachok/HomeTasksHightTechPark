package Оценка.buket;

public enum Flowers {
    ROZA_WHITE(5,4),ROZA_RED(6,3),
    GVOZDIKA(7,4),TULPAN(5,3),
    LILIA(4,10),GEORGIN(3,2);
    private int cost;
    private int life;

    Flowers(int cost, int life) {
        this.cost = cost;
        this.life = life;
    }

    public int getCost() {
        return cost;
    }

    public int getLife() {
        return life;
    }

}
