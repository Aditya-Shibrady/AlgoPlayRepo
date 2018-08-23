package OOP;

public class InterfaceExtend implements InterfaceTest {

    public void m1(){
        System.out.println("Successfully Implemented Interface");
    }

    public static void main (String args []) {
        InterfaceTest intf = new InterfaceExtend();
        intf.m1();
        InterfaceTest.m2();
    }
}
