
public class Mobile {
    String brand;
    int price;
    static String name;

    // static block call always at a one time
    static {
        Mobile.name = "gupcup";
        System.out.println("static");
    }

    public Mobile() {
        brand = "";
        price = 125;
        System.out.println("Constructor  ");
    }

    public void show() {
        System.out.println(name + " " + price + " " + brand);
    }

    public static void show1(Mobile obj) {
        System.out.println("This is the static method");
        System.out.println(name + " " + obj.price + " " + obj.brand);
    }

};

public class StaticWord {

    public static void main(String[] args) {
        // Mobile obj1 = new Mobile();
        // obj1.brand = "apple";
        // obj1.price = 1000;
        // // Mobile.name = "bhaesh";

        // Mobile obj2 = new Mobile();
        // obj2.brand = "samsung";
        // obj2.price = 1000;
        // // Mobile.name = "ram";

        // // Mobile.name = "BlaBla";

        // obj1.show();
        // obj2.show();

        // Mobile.show1(obj1);

        Class.forName("Mobile");
    }
}