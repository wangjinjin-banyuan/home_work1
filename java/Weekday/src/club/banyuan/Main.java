package club.banyuan;

import java.util.WeakHashMap;

public class Main {

    public static void main(String[] args) {
        Weekday sat = Weekday.SATURDAY;
         Weekday.weekdayPrint(Weekday.values());
        for(Weekday day: Weekday.values()){
           int i= day.compareTo(sat);
            System.out.println(""+day.getWeekdayName()+"与"+sat.getWeekdayName()+"相差值："+i);
        }
    }


}
