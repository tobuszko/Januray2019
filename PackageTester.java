import pl.edu.wszib.java.*;
import static java.lang.Math.PI;

public class PackageTester {

    public static void main(String[] args) {
        System.out.println("Pakiet " + PackageTester.class.getPackage());

        packagePresenter javaPP = new packagePresenter();
        pl.edu.wszib.podyplomowe.packagePresenter pPP= new pl.edu.wszib.podyplomowe.packagePresenter();
        javaPP.showPackage();
        pPP.showPackage();

        System.out.println(PI);
    }

}
