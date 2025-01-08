package oops;
//classes and object

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }

    public void colorType(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

class Student{
    String name;
    int age;

    public void printName(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class first {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();
        pen1.colorType();

        Student stu1 = new Student();
        stu1.age = 20;
        stu1.name = "pranshi";
        stu1.printName();
    }
}
