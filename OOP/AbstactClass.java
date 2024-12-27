
abstract class Car {
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("Play music");
    }
}

abstract class Wagnor extends Car {
    public void drive() {
        System.out.println("Driving........");
    }
}

class UpdatesWagnor extends Wagnor { // concreate Class
    public void fly() {
    }

}

public class AbstactClass {
    public static void main(String[] args) {
        Car obj = new UpdatesWagnor();
        obj.drive();
        obj.playMusic();
    }
}
