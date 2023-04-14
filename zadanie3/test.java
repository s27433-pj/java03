package zadanie3;

public class test {
    public static void Main(String[] args) {

        Circle circle = new Circle();

        Circle circle1 = new Circle(3);

        Circle circle2 = new Circle(4,"blue");

        Circle circle3 = new Circle();
        circle3.setColor("braz");
        circle3.setRadius(2);

        System.out.println("The circle c1 has radius of " + circle.getRadius() + " and area of " + circle.getArea() + " and color of " + circle.getColor() + "\nCircle : radius = "+ circle.getRadius() +" color = " + circle.getColor() );
        System.out.println("The circle c2 has radius of " + circle1.getRadius() + " and area of " + circle1.getArea() + " and color of " + circle1.getColor() + "\nCircle : radius = "+ circle1.getRadius() +" color =" + circle1.getColor());
        System.out.println("The circle c2 has radius of " + circle2.getRadius() + " and area of " + circle2.getArea() + " and color of " + circle2.getColor() + "\nCircle : radius = "+ circle2.getRadius() +" color =" + circle2.getColor());
        System.out.println("The circle c2 has radius of " + circle3.getRadius() + " and area of " + circle3.getArea() + " and color of " + circle3.getColor() + "\nCircle : radius = "+ circle3.getRadius() +" color =" + circle3.getColor());
    }
}