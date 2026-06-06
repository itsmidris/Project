package ShapeAreaCalculator;
// Trying all in one.
public class OneMain {
    public static void main(String[] args) {
        Shap s5 = new C(5);
        s5.calArea();

        Shap s6 = new R(5,4);
        s6.calArea();

        Shap s7 = new T(9,1);
        s7.calArea();
    }
}

abstract class Shap{
    abstract void calArea();
}

class C extends Shap{
    private float r;

    public C(float r){
        this.r=r;
    }

    @Override
    void calArea() {
        System.out.println("Circle Area is " + 3.14 * r * r);
    }
}

class R extends Shap{
    private float l;
    private float w;

    public R(float l, float w){
        this.l=l;
        this.w=w;
    }

    @Override
    void calArea() {
        System.out.println("Rectangle Area is " + l * w);
    }
}

class T extends Shap{
    private float b;
    private float h;

    public T(float b, float h){
        this.b=b;
        this.h=h;
    }

    @Override
    void calArea() {
        System.out.println("Triangle Area is " + 0.5 *b*h);
    }
}