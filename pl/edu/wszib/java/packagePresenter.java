package pl.edu.wszib.java;

public class packagePresenter {


    public packagePresenter() {
        System.out.println("Sobota");
    }

    public void showPackage (){
        System.out.println("To jest obiekt klasy: "+ this.getClass() + " w pakiecie: " + this.getClass().getPackage());
    }

    public static void main(String[] args) {
        packagePresenter pP = new packagePresenter();
        pP.showPackage();
    }

}
