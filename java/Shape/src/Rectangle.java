package club.banyuan.area;

public class Rectangle extends Shape {
private int a ,b ;

    @Override
    public String getShapeName() {
        return "矩形";
    }
    public Rectangle(int a,int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return   a * b;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }
}
