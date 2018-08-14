package Problems;

public class BinarySearch {

    public static void main (String args[]){
        Integer [] array = {1,2,3,4,5,6};
        Integer searchElement = 100;
        if(binarySearch(array, searchElement) == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position : " + binarySearch(array, searchElement));
        }

    }

    private static <T extends Comparable<? super T>> int binarySearch( T [ ] a, T x ) {

        int low = 0, high = a.length - 1;

        while( low <= high ) {

            int mid = ( low + high ) / 2;

            if( a[ mid ].compareTo( x ) < 0 ) low = mid + 1;

            else if( a[ mid ].compareTo( x ) > 0 ) high = mid - 1;

            else return mid;

        }

        return -1;

    }
}
