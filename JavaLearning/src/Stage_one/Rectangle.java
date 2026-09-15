package Stage_one;

public class Rectangle extends Shape {
    public double length;
    public double width;

    Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }
    public double area(){
        return this.length * this.width;
    }
}
