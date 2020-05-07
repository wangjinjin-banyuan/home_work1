package club.banyuan;

public class ReadyMadeCake extends Cake {
   int quantity;

    public int getQuantity() {
        return quantity;
    }



    public ReadyMadeCake(int i, double price, int quantity){
       super(i,price);
        this.quantity = quantity;

   }

    @Override
    public double calcPrice() {
        return price*quantity;
    }
}
