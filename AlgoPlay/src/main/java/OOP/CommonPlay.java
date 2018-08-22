package OOP;

public class CommonPlay {

    public static void main (String args[]){
        System.out.println(StaticKeyword.var1);

        //StaticKeyword.var4 = StaticKeyword.var4 + 34; Constant cant be changed

        //StaticKeyword.var1 = StaticKeyword.var4 + 34

        Child1 tester = new Child1();
        tester.m2();
        tester.m1();

        System.out.println(tester instanceof Child1);


    }

}
