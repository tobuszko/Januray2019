package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList();

        myList.add(100);
        myList.add(4);
        myList.add(100);
        myList.add(4);
        myList.add(100);
        myList.add(4);
        myList.add(100);
        myList.add(4);

        Object[] arr1 = myList.toArray();
        Integer[] arr2 = new Integer[myList.size()];
        arr2 = myList.toArray(arr2);



        for (Integer i: arr2){
            System.out.println(i);
        }

        List<Integer> myList1 = new ArrayList();
        for (int i = 0 ; i < 1000; i++){
            myList1.add(i*i);
        }

        System.out.println("Lista 1: " + myList.size());
        System.out.println("Lista 2: " + myList1.size());

        List<Integer> numbers = new ArrayList();
        numbers.addAll(myList);
        numbers.addAll(myList1);

        System.out.println("" + numbers);

        System.out.println(numbers.lastIndexOf(4));
    }
}
