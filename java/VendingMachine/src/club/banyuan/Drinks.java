package club.banyuan;

public class Drinks {

    private String name;
    private double price;
    private int number;
    private String light;
    public Drinks(){

    }
    public Drinks(String name,double price){
        this.name=name;
        this.price=price;

    }
    public Drinks(String name,double price,int number){
        this.name=name;
        this.price=price;
        this.number=number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }
    public  String lightCondition(int money) {
        if (this.getNumber()>0) {
            if (this.getPrice() <= money) {
                this.setLight("O");
            } else {
                this.setLight(" ");
            }

        } else{
            this.setLight("X");
        }
        return this.light;
    }
}
