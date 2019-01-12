import java.util.Random;
public class Maszyna {

    public static void main(String[] args) {
        Random randNum = new Random();

        RandomNumbers win = new RandomNumbers(7,7,7);
        RandomNumbers rn = new RandomNumbers();
        int i =1;

        while (!win.equals(rn)){
            rn.setNumber1(randNum.nextInt(9));
            rn.setNumber2(randNum.nextInt(9));
            rn.setNumber3(randNum.nextInt(9));
            //rn = new RandomNumbers(randNum.nextInt(9), randNum.nextInt(9), randNum.nextInt(9));
            System.out.println("Losowanie nr" + i);
            System.out.println(rn);
            i++;
        }



    }



}
