package OOP;

public class AbstractExtend extends AbstractTest {

    public void m1(){
        System.out.println("Abstact Implement");
    }

    public static void main (String args[]){
        AbstractTest abs = new AbstractExtend();
        abs.m1();
    }

}
