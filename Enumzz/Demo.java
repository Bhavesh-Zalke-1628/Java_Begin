enum Status {
    Running, Failed;
}

public class Demo {
    public static void main(String[] args) {

        Status s = Status.Failed; // get the single value
        System.out.println(s.ordinal()); // find the position
        Status[] s1 = Status.values();
        // System.out.println(s1[0]);

        for (Status i : s1) {
            System.out.println(i);
        }

    }

}
