package mypackage;


public class Class2 extends OtherCLass {

    public static void main(String[] args) {
        MyInterface2 myInterface2 = new Class2();
        myInterface2.myMethod();
    }
}

interface MyInterface {
    default void method() {
        System.out.println("Test MyInterface");
    }

    void test();
}

interface MyInterface2 extends MyInterface {

    void myMethod();
    void sum(int a, int b);
}

class OtherCLass implements MyInterface2 {

    @Override
    public void test() {
        System.out.println("test");
    }

    @Override
    public void myMethod() {
        System.out.println("myMethod");
    }

    @Override
    public void sum(int a, int b) {
        System.out.println("sum");
    }
}