package zadanie3;
public class Circle{
    private double radius;
    private String color;

    public Circle() {
        this.color = "red";
        this.radius = 0.0;
    }

    public Circle(double radius){
        this.radius = radius;
        this.color = "red";
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
}