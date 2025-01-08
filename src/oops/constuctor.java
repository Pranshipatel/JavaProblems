package oops;
//constructor
//Default Constructor
//Parameterized Constructor
//Copy Constructor

class Animal{
    String name;
    String color;

    public void animaltypo(){
        System.out.println(this.name);
        System.out.println(this.color);
    }

//    default constructor

    Animal(){
        System.out.println("contructor called");
    }

// Parameterized Constructor
    Animal(String name , String color){
        this.color = color;
        this.name = name;
    }

}

public class constuctor {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.color = "grey";
        animal.name = "elephant";
        animal.animaltypo();
        Animal animal2 = new Animal("tiger", "orange");
        animal2.animaltypo();
    }
}
