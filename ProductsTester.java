public class ProductsTester {

    public static void main(String[] args) {

        Products[] products = new Products[5];
        products[0] = new Products("Chleb", 2);
        products[1] = new Products("Sok", 3);
        products[2] = new Products("Chleb", 2);
        products[3] = new Products("Sok", 3);

        for (int i =0; i <2 ; i ++) {
            if (products[i].equals(products[i++])) {
                System.out.println("Te same produkty");
            } else {
                System.out.println("Różne produkty");
            }
        }



    }


}
