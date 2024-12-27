@FunctionalInterface
interface A {
    void show();
    // void run();
}

// class B implements A {
// public void show() {
// System.out.println("In show");
// }
// }

public class FunctionalInterFace {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("In show");
            }
        };
        obj.show();
    }
}
