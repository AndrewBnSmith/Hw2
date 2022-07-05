public class Circle extends Shape {

    double radius;

    public Circle() {
        radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, boolean isFilled, String color) {
        super(isFilled, color);
        this.radius = radius;

    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Radius: " + radius + "\n" + "Area: " + this.getArea() + "\n" + "Filled: " + this.GetFilled() + "\n" + "Color: " + this.getColor();
    }


}
