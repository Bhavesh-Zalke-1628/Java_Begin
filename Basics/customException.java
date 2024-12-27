
class MyException extends Exception {
    public MyException(String str) {
        super(str);
    }
}

public class customException {

    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0)
                throw new MyException("i dont want to ans is zero");
        } catch (ArithmeticException e) {
            j = 18 / 1;
            System.out.println("Thats the defautlt output is " + e);
        } catch (MyException e) {
            System.out.println("ja bhokat" + e);
        }
    }

}
