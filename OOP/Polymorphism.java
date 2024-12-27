// Dynamic Binding 
//  compile time polymorphism
class A {
    public void show() {
        System.out.println("In A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B show");
    }
}

class C extends A {
    public void show() {
        System.out.println("In C show");
    }
}

class D {
    public void show() {
        System.out.println("In D show");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        obj = new B();
        obj.show();
        obj = new C();
        obj.show();
        // obj = new D();
        // obj.show();
    }
}
