package club.banyuan;


public class Main {

    public static void main(String[] args) {
        Weekday sat = Weekday.SATURDAY;
         Weekday.weekdayPrint();
        for(Weekday day: Weekday.values()){
           int i= day.compareTo(sat);
           String token = i==0?"等于":(i>0?"大于":"小于");
            System.out.println(day.getWeekdayName()+"与"+sat.getWeekdayName()+"相差值："+i);
           System.out.println(day+token+sat);
        }
    }


}
