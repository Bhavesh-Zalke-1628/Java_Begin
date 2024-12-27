
// abstract class Computer {
//     public abstract void code();
// }

// class Laptop extends Computer {
//     public void code() {
//         System.out.println("Code compile run");
//     }
// }

// class Desktop extends Computer {
//     public void code() {
//         System.out.println("Code compile run : Faster");
//     }
// }

// class Developer {
//     public void devApp(Computer lap) {
//         lap.code();
//         System.out.println("Build a software");
//     }
// }

// public class NeedOfInterface {
//     public static void main(String[] args) {
//         Computer lap = new Laptop();
//         Computer desk = new Desktop();

//         Developer bhavesh = new Developer();

//         bhavesh.devApp(desk);
//     }
// }

//  better version is the interface

interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Code compile run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Code compile run : Faster");
    }
}

class Developer {
    public void devApp(Computer lap) {
        lap.code();
        System.out.println("Build a software");
    }
}

public class NeedOfInterface {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer bhavesh = new Developer();

        bhavesh.devApp(desk);
    }
}
