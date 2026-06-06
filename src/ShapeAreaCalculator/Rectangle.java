package ShapeAreaCalculator;

public class Rectangle extends Shape{
    private float length;
    private float width;

    public Rectangle(float length, float width){
        this.length=length;
        this.width=width;
    }

    @Override
    void calculateArea() {
        System.out.println("Rectangle Area: "+ length*width);
    }
}
