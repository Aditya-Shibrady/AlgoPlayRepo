package Problems;

public class EuclidGCD {

    public static void main (String args []) {
        System.out.println(euclidize(9,57));
    }

    private static long euclidize(long m, long n) {

        while (n!=0){
            long rem = m%n;
            m = n;
            n = rem;
        }
        return m;
    }
}
