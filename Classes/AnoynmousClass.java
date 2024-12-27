
// class A {

//     public void show() {
//         System.out.println("in A show");
//     }
// }

// public class AnoynmousClass {
//     public static void main(String[] args) {
//         A obj = new A() {
//             public void show() {
//                 System.out.println("in new  show"); // inherit and get priority to it This is AnoynmousClass
//             }
//         };
//         obj.show();
//     }

// }

abstract class A {

    public abstract void show();

    public abstract void config();
}

public class AnoynmousClass {
    public static void main(String[] args) {

        A obj = new A() {
            public void show() {
                System.out.println("In new show");
            }

            public void config() {
                System.out.println("In new config");
            }w
        };

        obj.show();
        obj.config();

    }
}