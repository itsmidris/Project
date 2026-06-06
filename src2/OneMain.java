public class OneMain {

    public static void main(String[] args) {

        Shape shapeReference1 = new Circle(5);

        shapeReference1.calArea();

        Shape shapeReference2 =new Rectangle(5, 4);

        shapeReference2.calArea();

        Shape shapeReference3 =new Triangle(9, 1);

        shapeReference3.calArea();
    }
}

abstract class Shape {

    abstract void calArea();
}

class Circle extends Shape {

    // Variable stored INSIDE object
    private float objectRadius;

    public Circle(float constructorRadius) {

        // Object variable = constructor variable
        objectRadius = constructorRadius;
    }

    @Override
    void calArea() {

        System.out.println(
                "Circle Area = "
                        + 3.14 * objectRadius * objectRadius
        );
    }
}

class Rectangle extends Shape {

    private float objectLength;
    private float objectWidth;

    public Rectangle(
            float constructorLength,
            float constructorWidth) {

        objectLength = constructorLength;
        objectWidth = constructorWidth;
    }

    @Override
    void calArea() {

        System.out.println(
                "Rectangle Area = "
                        + objectLength * objectWidth
        );
    }
}

class Triangle extends Shape {

    private float objectBase;
    private float objectHeight;

    public Triangle(
            float constructorBase,
            float constructorHeight) {

        objectBase = constructorBase;
        objectHeight = constructorHeight;
    }

    @Override
    void calArea() {

        System.out.println(
                "Triangle Area = "
                        + 0.5 * objectBase * objectHeight
        );
    }
}