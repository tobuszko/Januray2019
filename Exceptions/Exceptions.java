package Exceptions;

public class Exceptions {


    public static void main(String[] args) {
    Exceptions ex = new Exceptions();
    ex.method1();


    }

    public void method1(){
        method2();

    }

    public void method2 () {
        method3();
    }

    public void method3 (){
        throw new RuntimeException("BUMM!!!");
    }

}



class StackTraceExample {



}
