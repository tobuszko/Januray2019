package Exceptions;

public class ThrowExecptionTester {

    public static void main(String[] args) {
        int hours = 30;
        int numberofSeconds = 0;

        ThrowExecptionTester tT = new ThrowExecptionTester();

        try {
            numberofSeconds = tT.getNUmberOfSeconds(hours);
            System.out.println("Liczba sekund w: " + hours + " to " + numberofSeconds);
        } catch (IllegalArgumentException e) {
            System.out.println("Liczba godzin musi być większa niż 0");
            numberofSeconds = tT.getNUmberOfSeconds(hours * -1);
            System.out.println("Liczba sekund w: " + hours + " to " + numberofSeconds);
        }
    }



    public int getNUmberOfSeconds (int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Liczba godzin musi być większa niż 0");
        }
        return hours*60;
    }

    }



