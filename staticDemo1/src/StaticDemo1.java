public class StaticDemo1 {

    public static void main(String[] args) {
        Person p1 = new Person("lihua",23);
        p1.country = "中国";
        Person p2 = new Person("tom",32);
        p2.country = "美国";
        //通过对象调用
        System.out.println(p1.name + "-" + p1.age + "-" + p1.country);
        System.out.println(p2.name + "-" + p2.age + "-" + p2.country);
        //通过类调用
        System.out.println(Person.country);
    }
}

class Person{
    //修饰成员变量
    static String country;
    String name;
    int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public static void show(Person p){
        System.out.println(p.name+"-"+p.age+"-"+country);
    }
}