package oops;

class Fruits{
    String name;
    String taste;

    public void fruittypo(){
        System.out.println(this.name);
        System.out.println(this.taste);
    }

   Fruits(Fruits fruit2){
        this.name = fruit2.name;
        this.taste = fruit2.taste;
   }
   Fruits(){

   }
}
public class copyConstructor {
    public static void main(String[] args) {
        Fruits fruit1 = new Fruits();
        fruit1.name = "mango";
        fruit1.taste = "very tasty";

        Fruits fruit2 = new Fruits(fruit1);
        fruit2.fruittypo();
    }
}
