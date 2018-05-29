public class InterfaceDemo{
    public static void main(String[] args){
        Vehicle p = new Plane();
        p.transit();
        Car car = new Car();
        car.attack();
        System.out.println(
        new Product(){
            @Override
            public float getPrice(){
                return 3.3f;
            }

            @Override
            public String getName(){
                return "苹果";
            }
        }.getName());
    }
}

abstract class Vehicle{
    private float velocity;
    private float weight;
    private String name;
    private String id;

    public abstract void transit();
}

class Plane extends Vehicle{
    @Override
    public void transit() {
        System.out.println("空中飞");
    }
}

interface Combat{
    void attack();
}
class Car extends Vehicle implements Combat{
    @Override
    public void transit() {
        System.out.println("在陆地跑");
    }

    @Override
    public void attack() {
        System.out.println("发射炮弹");
    }
}

class Boat extends Vehicle{
    @Override
    public void transit() {
        System.out.println("在水上走");
    }
}
//接口与匿名内部类
interface Product{
    float getPrice();
    String getName();
}
