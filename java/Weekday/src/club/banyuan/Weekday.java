package club.banyuan;

import java.nio.file.Watchable;

public enum Weekday {
    MONDAY("星期一",1),
    TUESDAY("星期二",2),
    WEDNESDAY("星期三",3),
    THURSDAY("星期四",4),
    FRIDAY("星期五",5),
    SATURDAY("星期六",6),
    SUNDAY("星期日",7);
    private final String weekdayName;
    private final int weekdayNum;



     Weekday(String weekdayName,int num){
       this.weekdayName=weekdayName;
       this.weekdayNum=num;
     }
    public static boolean isWeekDay(String weekdayName){
         Weekday[] values = values();
         for(Weekday one : values){
             if(one.weekdayName.equals(weekdayName)){
                 if(one.weekdayNum<=5&&one.weekdayNum>0){
                     return true;
                 }
                 else {
                     return false;
                 }
             }
         }
         return false;
     }

     public static boolean isHoliday(String weekdayName){
         Weekday[] values = values();
         for(Weekday one : values){
             if(one.weekdayName.equals(weekdayName)){
                 if(one.weekdayNum>5&&one.weekdayNum<=7){
                     return true;
                 }
                 else
                 {
                     return false;
                 }
             }
         }
         return false;
     }



     public String toString(){
         return this.weekdayName;
     }

    public String getWeekdayName() {
        return weekdayName;
    }

    public int getWeekdayNum() {
        return weekdayNum;
    }

    public static void weekdayPrint(Weekday[] val){
        for(Weekday one:val){
            if(Weekday.isHoliday(one.toString())){
                System.out.println(""+one.toString()+"是假日");
            }
            if(Weekday.isWeekDay(one.toString())){
                System.out.println(""+one.toString()+"是工作日");
            }
        }
    }



}
