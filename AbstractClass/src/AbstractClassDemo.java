public class AbstractClassDemo{

    public static void main(String[] args){
        Programmer programmer = new Programmer(10110,"tom",20000);
        programmer.work();
    }
}
//雇员类
abstract class Employee{
    private int id;
    private String name;
    private float pay;
    public Employee(int id,String name,float pay){
        this.id = id;
        this.name = name;
        this.pay = pay;
    }
    public abstract void work();
}
//程序员类
class Programmer extends Employee{
    public Programmer(int id,String name,float pay){
        super(id,name,pay);
    }

    public void work(){
        System.out.println("编程。。。。");
    }
}
//项目经理类
class Manager extends Employee{
    private float bonus;
    public Manager(int id,String name,float pay,float bonus){
        super(id,name,pay);
        this.bonus = bonus;
    }
    public void work(){
        System.out.println("写需求");
    }
}