
// the developer is totally depend upon the Laptop not other 
//  this is know as the tight coupling 

class Laptop {
    public void work() {
        System.out.println("this is the Work on laptop");
    }
}

class Developer extends Laptop {
    public void show(Laptop lap) {
        System.out.println("i am only work with laptop");
        lap.work();
    }
}

public class TightCopupling {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        Developer dev = new Developer();
        dev.show(lap);

    }
}
