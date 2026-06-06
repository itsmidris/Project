package ShapeAreaCalculator;

public class Triangle extends Shape{
    private float base;
    private float height;

    public Triangle(float base, float height){
//        System.out.println("Triangle Area: "+0.5*base*height);
        this.base=base;
        this.height=height;
    }

    @Override
    void calculateArea() {
        System.out.println("Triangle Area: "+0.5*base*height);
    }

}
