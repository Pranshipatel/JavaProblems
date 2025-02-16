package oops;

public class classes_object {
    public static void main(String[] args) {
        Pens p1 = new Pens();
        p1.setColor("red");
        System.out.println(p1.color);
    }
}

class Pens{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}


class Students{
    String name;
    int age;
    int roll;

    void setName(String newName){
        name = newName;
    }
}