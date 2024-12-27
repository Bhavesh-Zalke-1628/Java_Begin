
// final variable  => constant Variaable
//  final method => stop overriding 
//  final class => stop inheritance (extends)

final class Calculator {

    public void show() {
        System.out.println("Calc in show");
    }

    public void add(int n1, int n2) {
        System.out.println(n1 + n2);
    }
}

// class AdvanceCal extends Calculator {

// }

public class FinalWord {
    public static void main(String[] args) {

        // final int x = 10; // final treat as the constant
        // // x = 20;
        // System.out.println(x);

        Calculator obj = new Calculator();
        obj.show();
        obj.add(10, 20);
    }
}
