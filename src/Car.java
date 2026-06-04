public class Car {

    //fields , attributes, properties
    String color;
    String brand;
    int speed; //instance variable

    public static void main() {
        Car car1=new Car();
        car1.speed=100;
        car1.run();



    }

    //behaviour //actions

    public void run(){
        System.out.println("Car is running at " + speed);
    }
}
