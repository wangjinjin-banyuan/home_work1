package club.banyuan;

public class Commission extends Hourly {
    double totalSales=0;
    double commission;


    public Commission(String eName, String eAddress, String ePhone,String socSecNumber, double rate,double commission){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commission =commission;
    }


    public void addSales(int hours,double totalSales){
           this.totalSales+=totalSales;
           super.addHours(hours);
    }



    public double pay(){
       double payment= super.pay()+commission*totalSales;
       return payment;
    }

    public String toString(){
        String result=super.toString()+"总销售额"+totalSales;
        return result;
    }
}
