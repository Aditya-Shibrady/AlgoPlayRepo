package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorPlay {

    public static void main (String args[]){
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(3);
        testList.add(2);
        testList.add(9);

        //Before sorting
        System.out.println("Before Sorting");
        PrintIntegerList.print(testList);

        //After Sorting
        System.out.println("After Sorting");
        Collections.sort(testList);
        PrintIntegerList.print(testList);

    }
}
