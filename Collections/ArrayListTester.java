package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTester {

    public static void main(String[] args) {

        List<Integer>  myList = new ArrayList();

        myList.add(100);
        myList.add(4);
        myList.add(100);
        myList.add(4);
        myList.add(100);
        myList.add(4);
        myList.add(100);
        myList.add(4);


        for (Integer i : myList){
            System.out.println("Liczba : " + i);
        }


        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()){
            if (iterator.next() == 100) {
            iterator.remove();
            }
                System.out.println(iterator.next());
            }


        //System.out.println(myList.size());
        //System.out.println(myList.get(0));

        //myList.remove(0);
        //System.out.println(myList.get(0));

        //myList.clear();
        //System.out.println(myList.size());
        //System.out.println(myList.get(0));


        System.out.println("ListIterator");

        ListIterator<Integer> lI = myList.listIterator();
        while (lI.hasNext()){
            System.out.println(lI.next());

        }

        myList.add(13);
        myList.add(23);
        myList.add(63);
        myList.add(73);
        lI = myList.listIterator();

        while (lI.hasPrevious()){
            Integer index = lI.previousIndex();
            Integer value = lI.previous();
            System.out.println(" " + value + " " + index);
        }



    }

}
