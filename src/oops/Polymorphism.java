package oops;

class Batch{
    String name;
    String house;
    int age ;

    public void printInfo(int age){
        System.out.println(age);
    }

    public void studentInfo(String name , String house){
        System.out.println(name + " "+ house);
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        Batch stu1 = new Batch();
        stu1.name = "pranshi";
        stu1.house = "blue";
        stu1.age = 20;
        stu1.printInfo(stu1.age);
        stu1.studentInfo(stu1.name , stu1.house);
    }
}
