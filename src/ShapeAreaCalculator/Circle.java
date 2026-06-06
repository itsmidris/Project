package ShapeAreaCalculator;

public class Circle extends Shape{
    private float radius;

    public Circle(float radius){
        this.radius=radius;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of Circle: " + 3.14*radius*radius);
    }

}
