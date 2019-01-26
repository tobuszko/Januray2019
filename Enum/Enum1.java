package Enum;

public class Enum1 {


    public static void main(String[] args) {
        System.out.println(Types.ONE);
        System.out.println(Types.valueOf("TWO"));
        System.out.println(Types.THREE.name());

        for (Types t : Types.values()){
            System.out.println(t.ordinal());
        }

    }
}

enum Types {
    ONE, TWO, THREE
}
