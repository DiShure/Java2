public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this.width = -1;
        this.height = -1;
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
    // Getter for width
    public double getWidth() {
        return width;
    }
    // Getter for height
    public double getHeight() {
        return height;
    }
}