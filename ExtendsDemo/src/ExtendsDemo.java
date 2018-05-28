public class ExtendsDemo {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("苍老师" ,32,'女',"高级","生物","二班");
        teacher.eat();
        teacher.sleep();
        teacher.teach();
        System.out.println("------------");
        Student student = new Student("李明",15,'男',3,10);
        student.eat();
        student.sleep();
        student.learn();
    }
}
class Person{
    private String name;
    private int age;
    private char gender;
    public Person(){}
    public Person(String name,int age,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public void eat(){
        System.out.println(name + "在吃饭");
    }
    public void sleep(){
        System.out.println(name + "在睡觉");
    }
}
//老师类
//名字  年龄  性别
//职称  课程名称  所教班级
class Teacher extends Person{
    private String title;
    private String course;
    private String className;
    public Teacher(){}
    public Teacher(String name,int age,char gender,String title,String course,String className){
        super(name,age,gender);
        this.title = title;
        this.course = course;
        this.className = className;
    }
    public void teach(){
        System.out.println(getName() + "在" + className + "教" + course);
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public String getClassName(){
        return className;
    }
    public void setClassName(String className){
        this.className = className;
    }
}

//学生类
//名字  年龄  性别
//所在班级  排名
class Student extends Person{
    private int classNumber;
    private int rankNumber;
    public Student(){}
    public Student(String name,int age,char gender,int classNumber,int rankNumber){
        super(name,age,gender);
        this.classNumber = classNumber;
        this.rankNumber = rankNumber;
    }
    public void learn(){
        System.out.println(getName() + "在学习");
    }

    public int getClassNumber(){
        return classNumber;
    }
    public void setClassNumber(int classNumber){
        this.classNumber = classNumber;
    }
    public int getRankumber(){
        return rankNumber;
    }
    public void setRankNumber(int rankNumber){
        this.rankNumber = rankNumber;
    }
}