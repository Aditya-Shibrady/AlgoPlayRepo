package collections;

import java.util.*;

public class CollectionsTest {

    public static void main (String args []) {

        Employee e1 = new Employee();
        e1.setName("Aditya");
        e1.setEid(747);

        Employee e2 = new Employee();
        e2.setName("Varsha");
        e2.setEid(420);

        Employee e3 = new Employee();
        e3.setName(null);
        e3.setEid(null);

        List<Employee> employee = new ArrayList<>();
        employee.add(e1);
        employee.add(e2);
        employee.add(e3);



        Set<Employee> empset = new HashSet<>();
        empset.add(e1);
        empset.add(e2);
        empset.add(e3);



        TreeMap<Integer, Employee> empTree = new TreeMap<>();
        empTree.put(1545,e1);
        empTree.put(2,e2);

        Set set = empTree.entrySet();

//        for(Object o: set){
//            System.out.println(o);
//        }

        Iterator itr = set.iterator();

        while(itr.hasNext()){
            Map.Entry map = (Map.Entry) itr.next();
            System.out.println((map.getValue()).toString());
            System.out.println((map.getKey()));
        }

        LinkedList<String> ll = new LinkedList<>();
        ll.add("k");
        ll.add("n");
        System.out.println(ll);

        Iterator itry = ll.iterator();

        while(itry.hasNext()){
            System.out.println(itry.next());
        }




    }



}
