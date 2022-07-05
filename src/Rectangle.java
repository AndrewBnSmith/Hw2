public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle() {
        setLw(1,2);
    }

    public Rectangle(double width, double length) {
        setLw(width, length);

    }

    public Rectangle(double width, double length, boolean isFilled, String color) {

        super(isFilled, color);
        setLw(width, length);
    }

    void setLw(double x, double y) {
        if (x > y) {
            this.length = x;
            this.width = y;
        } else {
            this.length = y;
            this.width = x;

        }
    }

    double getArea(){
        return this.length * this.width;
    }

    @Override
    public String toString(){
        return "Width: "  + this.width + "\n" + "Length: "  + this.length + "\n" + "Area: "  + this.getArea() + "\n" + "Filled: "  + super.GetFilled() + "\n" + "Color: "  + super.getColor();
    }










}
