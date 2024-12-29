class A extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("hii");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("hello");
        }
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class CreateTh {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}
