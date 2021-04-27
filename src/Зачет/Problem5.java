package Зачет;

public class Problem5 {
    /*Электронные часы показывают время в формате от 00:00 до 23:59.
Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
что справа от двоеточия (например, 02:20, 11:11 или 15:51)*/
    public static void main(String[] args) {
     int m1,m2,hour,min,minrev,z=0;

        for (hour=0;hour<=23;hour++){
            for (min=0;min<=59;min++){
                m1=min/10;//первая цифра минут
                m2=min%10;//вторая цифра минут
                minrev=m2*10+m1;//замена цифр минут местами
                if (hour==minrev){
                    z+=1;
                    System.out.println(hour+" : "+min);
                }
            }
        }
        System.out.println("Количество симметричных пар = "+z);


    }
}
