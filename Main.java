public class Main {

    static synchronized  protected final void specialMethod(){}
    public static final int A = 5;

    public static void main(String[] args) {

            A a = new A();
            a.setCounter(124);
            a.print();


            WashingMachine wm = new WashingMachine();
            wm.modeForGeneral();


            B b = new B();
            b.test();

    }
}


class  A {
    protected int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void print (){
        System.out.println(counter + "Jestem obieketm klasy A");
    }

}


class B extends A {
    A a = new A();

    void test (){
        a.counter = 100;
        System.out.println(a.counter);
    }

}