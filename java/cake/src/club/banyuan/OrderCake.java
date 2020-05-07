package club.banyuan;

public class OrderCake extends Cake {
    double weightInKG;

    public double getWeightInKG() {
        return weightInKG;
    }


    public OrderCake(int n,double price,double weightInKG){
      super( n,price);
      this.weightInKG=weightInKG;
    }

    @Override
    public double calcPrice() {
        return price*weightInKG;
    }
}
