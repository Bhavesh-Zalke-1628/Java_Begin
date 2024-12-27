interface A {

    // variable are by default final and static

    int age = 20;
    String name = "Ram";

    void show(); // all method are public abstact already

    void config();
}

class B implements A {
    public void show() {
        System.out.println("In Show");
    }

    public void config() {
        System.out.println("In config");

    }
}

public class Basic {
    public static void main(String[] args) {

        A obj;
        obj = new B();
        obj.show();
        obj.config();
        String x = A.name;
        // A.name = "Goa"; // name is final
        System.out.println(x);
    }
}
