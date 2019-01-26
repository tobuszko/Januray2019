package Enum;

public class testSize {

    public static void main(String[] args) {
        Tshirt[] ts = {
                new Tshirt(TshirtSize.S, "Polex"),
                new Tshirt(TshirtSize.L, "BBB"),
                new Tshirt(TshirtSize.M, "CCC"),
                new Tshirt(TshirtSize.XL, "DDDD"),
                new Tshirt(TshirtSize.S, "EEEEE")
        };

        for (Tshirt t : ts) {
            System.out.println("KOszulka marki " + t.getManufacturer() + " o rozmiarze: " + t.getSize());
        }



    }
}
