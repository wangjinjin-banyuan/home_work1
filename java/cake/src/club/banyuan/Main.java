package club.banyuan;

public class Main{
    public static Cake[] CreateCake(){
        Cake[] cakeArr = new Cake[10];
        cakeArr[0] = new OrderCake(1, 8, 3);
        cakeArr[1] = new OrderCake(2,6 , 5);
        cakeArr[2] = new OrderCake(3, 20, 4);
        cakeArr[3] = new OrderCake(4, 12, 2);
        cakeArr[4] = new OrderCake(5, 7, 6);
        cakeArr[5] = new ReadyMadeCake(6, 10, 7);
        cakeArr[6] = new ReadyMadeCake(7, 11, 9);
        cakeArr[7] = new ReadyMadeCake(8, 12, 2);
        cakeArr[8] = new ReadyMadeCake(9, 13, 4);
        cakeArr[9] = new ReadyMadeCake(10, 14, 5);
        return cakeArr;
    }
    public static void AllCakePrice(Cake[] cakeArr){
        double AllCakesPrice = 0;
        for (int i = 0; i < cakeArr.length; i++) {
            AllCakesPrice += cakeArr[i].calcPrice();
        }
        System.out.println("所有蛋糕的总价为"+AllCakesPrice);
    }

    public static void showReadyMadeCakePriceAndQuantity(Cake[] cakeArr){
        double AllReadyMadeCakePrice = 0;
        int AllReadyMadeCakeQuantity = 0;
        for (int i = 0; i <cakeArr.length ; i++) {
            if(cakeArr[i] instanceof OrderCake)
                continue;
            AllReadyMadeCakePrice += cakeArr[i].calcPrice();
            AllReadyMadeCakeQuantity += ((ReadyMadeCake)cakeArr[i]).getQuantity();
        }
        System.out.println("ReadyMadeCake蛋糕的总价是"+AllReadyMadeCakePrice+",总数是"+AllReadyMadeCakeQuantity);
    }


    public static void showHighestCakeInformation(Cake[] cakeArr){
        int temp = 0;
        for (int i = 0; i <cakeArr.length ; i++) {
            if(cakeArr[temp].calcPrice() <=cakeArr[i].calcPrice())
            {
                temp = i;
            }
        }
        if(cakeArr[temp] instanceof OrderCake){
            System.out.println("id:"+((OrderCake)cakeArr[temp]).id);

            System.out.println("price:"+((OrderCake)cakeArr[temp]).price);

            System.out.println("weightInKG:"+((OrderCake)cakeArr[temp]).getWeightInKG());
        }else{
            System.out.println("id:"+((ReadyMadeCake)cakeArr[temp]).id);

            System.out.println("price:"+((ReadyMadeCake)cakeArr[temp]).price);

            System.out.println("quantity:"+((ReadyMadeCake)cakeArr[temp]).getQuantity());
        }
    }
public static void main(String[] args){
    Cake[] cakeArr = CreateCake();
    AllCakePrice(cakeArr);
    showReadyMadeCakePriceAndQuantity(cakeArr);
    showHighestCakeInformation(cakeArr);

}
}
