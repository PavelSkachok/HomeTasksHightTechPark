package Оценка.buket;

import java.util.ArrayList;

public class Buket {
    ArrayList<Flowers> buk=new ArrayList<>();
private int numflow;
private int value=0;
private int life;
    public Buket() {

        numflow=(int)(6*Math.random()+3);
        for (int i = 0; i <numflow; i++) {
            buk.add(Flowers.values()[(int)(Flowers.values().length*Math.random())]);
        }
        this.life=buk.get(0).getLife();
    }
int stoimBuk(){
    for (int i = 0; i < buk.size(); i++) {
        value+=buk.get(i).getCost();
    }
    return value;
}
int srokLife(){
        for (int i=0;i<buk.size();i++){
            if (life>=buk.get(i).getLife()){
                life=buk.get(i).getLife();
            }
        }
        return life;
}
void elemBuk(){
    for (Flowers i:buk) {
        System.out.println(i);
    }
}
void addCvet(Flowers a){
        buk.add(a);
}
void removeCvet(Flowers a){
        buk.remove(a);
}
}
