package recursion;

public class Power {

    private static Integer power(Integer x, Integer n){
        if (n==0){
            return 1;
        } else {
            return x * power(x, n-1);
        }
    }

    public static void main (String args[]){
        System.out.println(power(2,5));
    }
}
