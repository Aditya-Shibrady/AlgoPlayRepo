package OOP;

public class Overloading {
    public static void m1(){
        System.out.println("original");
    }

    public static void m1(String a){
        System.out.println("original" + a);
    }

    public static void main(String args[]){
        m1();
        m1("Adi");
    }
}
