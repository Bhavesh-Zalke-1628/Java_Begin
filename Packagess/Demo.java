import tools.AdvCalc;
import tools.A;

public class Demo {
    public static void main(String[] args) {

        // // Create an object of AdvCalc
        // AdvCalc obj = new AdvCalc();

        // // Use the inherited add method from Calc
        // obj.add(10, 20);

        // // Use the multi method from AdvCalc
        // obj.multi(10, 20);

        A obj5 = new A();
        B obj6 = new B();
        System.out.println(obj6.marks);
        System.out.println(obj5.marks);
        obj5.show();

    }
}
