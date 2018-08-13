package collections;

import java.util.ArrayList;

public class PrintIntegerList {

    public static void print(ArrayList<Integer> listElement){
        printList.m1(listElement);
    }

    private static InterfCommon printList = (listElement) -> {
        for (Integer i : listElement) {
            System.out.println(i);
        }
    };
}
