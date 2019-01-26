package Exceptions;

public class UncheckedExceptionTester {

    public static void main(String[] args) {
        UncheckedExceptionTester uet = new UncheckedExceptionTester();
        int i = uet.getNumberFromString("9");
        if (i != -1) {
            System.out.println("Oto nasza liczba * 99: " + i * 99);
        }
    }


    public int getNumberFromString (String number) {
        try {

            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("Upewnij się, że przekazywany string to liczba");
        }
        return -1;
    }


}
