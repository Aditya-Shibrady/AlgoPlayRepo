package Problems;

//Computes power of X^n in O(Log(n))
public class PowerXn {

    public static void main(String args[]) {
        System.out.println("O(n) Solution : " + simplePower(2,5));

        System.out.println("O(log n) Solution : " + logPower(2,5));
    }

    private static int simplePower(int x, int n) {
        int result=1;
        if(n == 0){
            return 1;
        }
        while (n>0){
            result = result * x;
            n--;
        }
        return result;
    }

    private static int logPower(int x, int n){
        if (n==0){
            return 1;
        }
        if((n%2)==0) {
            return logPower(x*x, n/2);
        }
        else {
            return (logPower(x*x, n/2) * x);
        }
    }
}
