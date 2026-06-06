package ShapeAreaCalculator;

public class Main3 {

    public static void main(String[] args) {
        Shape s1 = new Circle(1);
        s1.calculateArea();

        Shape s2 =new Rectangle(4,3);
        s2.calculateArea();

        Shape s3 = new Triangle(4,5);
        s3.calculateArea();
    }
}
