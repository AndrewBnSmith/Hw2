public class Shape {

    private boolean isFilled;
    private String color;

    public Shape() {
        isFilled = true;
        color = "Green";
    }

    public Shape(boolean isFilled, String color) {
        this.isFilled = isFilled;
        this.color = color;
    }


    public boolean GetFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Filled: " + isFilled + "\n Color: " + color;
    }

}
