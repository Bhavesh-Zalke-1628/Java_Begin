
class A {
    public void show1() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("in A show");
    }
}

public class UpcastinAndDownCasting {
    public static void main(String[] args) {
        // double val = 4;
        // int i = (int) val;
        // System.out.println(val);
        // System.out.println(i);

        A obj = (A) new B();
        obj.show1();
    }
}
