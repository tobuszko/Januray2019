package Enum;

public class SideTest {

    public static void main(String[] args) {

        //System.out.println(Sides.EAST.getAll());
        for (Sides side : Sides.values()){
            System.out.println(side.getAll());
        };
    }
}
