package Enum;

import java.security.SecureRandom;
import java.util.Random;

public class ComputationTest {

    public static void main(String[] args) {


        //System.out.println(Computation.ADD.perform(1, -5));

        Random randNum = new Random();
        int x, y;

        for (Computation c : Computation.values()){
            x = randNum.nextInt(10);
            y = randNum.nextInt(10);
            System.out.println("Działanie: " + c + " dla liczb: " + x + " oraz " + y);
            System.out.println(c.perform(x, y));
        }
    }

}
