
// the Programmer are  not  totally depend on the any one class like laptop ||  desktop
//  it is the loose compling 

interface Computer {
    void work();
}

class Desktop implements Computer {
    public void work() {
        System.out.println("I am work with the desktop");
    }
}

class Laptop implements Computer {
    public void work() {
        System.out.println("I am work with the Laptop");
    }
}

class Programmer {
    public void code(Computer com) {
        System.out.println("I am work with");
        com.work();
    }
}

public class LooseCoupling {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Programmer pro = new Programmer();
        pro.code(lap);
        pro.code(desk);
    }
}
