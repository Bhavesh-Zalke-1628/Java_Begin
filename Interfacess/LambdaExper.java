// @FunctionalInterface
// interface A {
//     void show(int i);
// }

// public class LambdaExper {

//     public static void main(String[] args) {
//         // A obj = () -> System.out.println("In shiw"); // default
//         A obj = (i) -> System.out.println("In show " + i);

//         obj.show(5);
//     }
// }

@FunctionalInterface
interface A {
    int add(int i, int j);
}

public class LambdaExper {

    public static void main(String[] args) {

        A obj = (i, j) -> i + j;

        int res = obj.add(10, 20);
        System.out.println(res);
    }
}
