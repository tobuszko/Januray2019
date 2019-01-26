package Exceptions;

import java.util.Scanner;

public class SquareTest {

    public static void main(String[] args) {


            Scanner readNumber = new Scanner(System.in);
            System.out.println("Podaj dowolną liczbę całkowitą:");
            int userNumber = readNumber.nextInt();

            SquareEngine se = new SquareEngine(5);

    }
}
