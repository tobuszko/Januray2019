public class EmployeeTester {

    public static void main(String[] args) {
        Eployee e = new Eployee ("Jan", 20, 400);
        Eployee e1 = new Eployee("Tom", 40, 500);
        Eployee e2 = new Eployee ("Jan", 20, 400);


        if (e.equals(e2)){
            System.out.println("Ten sam pracownik");
        } else{
            System.out.println("Różni pracownicy");
        }

    }

}
