
public class WrapperClass {
    public static void main(String[] args) {
        // int num = 10;
        // Integer num1 = new Integer(8); // boxing
        // Integer num2 = 10;

        int num1 = 7;
        Integer num2 = num1; // auto-Boxing

        int num3 = num2; // auto-Unboxing

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        String str = "20";
        int num4 = Integer.parseInt(str); // wrapperClass
        System.out.println(num4);
    }
}
