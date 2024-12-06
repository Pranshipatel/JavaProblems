package OOPs;

class Pen{
    String color;
    String type;  //ballpoing , get etc

    public void write(){
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}
public class first {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color ="blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";
        pen1.printColor();
        pen2.printColor();
    }
}
