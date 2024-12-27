
// method  overriding
class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public void config() {
        System.out.println("Show A config");

    }
};

class AdvCal extends Calc {
    public int add(int n1, int n2) {
        return n1 + n2 + 1;
    }

}

public class MethodOverriding {
    public static void main(String[] args) {
        AdvCal obj = new AdvCal();
        int x = obj.add(10, 20);
        System.out.println(x);
    }
}
