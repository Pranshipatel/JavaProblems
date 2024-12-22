package functions;

public class functions {
    public void m1(){
        System.out.println("m1 pass");
        m2();

    }
    public void m2(){
        System.out.println("m2 pass");
        m3();
    }
    public void m3(){
        System.out.println("m3 pass");
    }
    public static void main(String[] args) {
        functions obj = new functions();
        obj.m1();
        System.out.println("all pass");
    }
}
