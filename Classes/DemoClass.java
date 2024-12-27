package Classes;

class Calculator {
    public int add(int num1, int num2) {
        int r = num1 + num2;
        return r;
    }

};

public class DemoClass {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int num1 = 10;
        int num2 = 20;
        int result = cal.add(num1, num2);
        System.err.println(result);
    }
}
