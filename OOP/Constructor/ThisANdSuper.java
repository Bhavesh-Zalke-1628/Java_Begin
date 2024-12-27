class A extends Object {
    public A() {
        super();
        System.out.println("in A");
    }

    public A(int x) {
        this();
        System.out.println("int a");
    }
};

class B extends A {
    public B() {
        super(25);
        System.out.println("in b");
    }

    public B(int x) {
        this();
        System.out.println("int b");
    }
}

public class ThisANdSuper {
    public static void main(String[] args) {

        B obj = new B(12);
    }

}