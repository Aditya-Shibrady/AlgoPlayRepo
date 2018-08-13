package recursion;

public class Factorial {

    public static void main (String args[]){

        System.out.println("The factorial is : " + fact(67));
    }

    private static Double fact(int n) {
        if(n<=1){
            return 1.0;
        } else {
            return (n * fact(n-1));
        }
    }
}
