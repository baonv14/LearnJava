package Stage_one;

public class Circle extends Shape {
    public double radius;
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double area(){
               return this.radius = Math.PI * Math.pow(this.radius, 2);
        }
}
