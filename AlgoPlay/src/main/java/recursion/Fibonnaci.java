package recursion;

//Finds nth element of Fibonnaci series
public class Fibonnaci {

    public static void main (String args[]){
        System.out.println(fib(5));
    }

    private static Integer fib (Integer n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;

        return fib(n - 1) + fib(n - 2);
    }

}