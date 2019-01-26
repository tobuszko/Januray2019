package Collections;

import java.util.ArrayList;

public class ArrayLIstTester1 {


    public static void main(String[] args) {
        ArrayList aL = new ArrayList();

        aL.add(11);
        aL.add(new Object());
        aL.add("siedem");
        System.out.println(aL.get(0));
        System.out.println(aL.get(1));
        System.out.println(aL.get(2));

    }

}
