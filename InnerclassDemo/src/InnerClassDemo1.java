public class InnerClassDemo1{

    public static void main(String[] args){
        Outer.Inner inner = new Outer(2).new Inner(20,"tom");
        inner.show();
    }
}
//外部类
class Outer{
    private int age;
    public Outer(int age){
        this.age = age;
    }
    //内部类
    public class Inner{
        private float weight;
        private String name;
        public Inner(float weight,String name){
            this.weight = weight;
            this.name = name;
        }
        public void show(){
            System.out.println(weight + "-" + name + "-" + age);
        }
    }
    public void test(){
        Inner in = new Inner(20,"inner class");
        in.show();
    }
}