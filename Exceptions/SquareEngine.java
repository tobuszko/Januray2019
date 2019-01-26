package Exceptions;

public class SquareEngine {

    private int number;

    SquareEngine(int n){
        this.number = n;
    }

    public double getSquare (int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Podałeś liczbę ujemną");
        }else {
            return Math.sqrt(number);
        }
    }


}
