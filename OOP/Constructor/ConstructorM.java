package OOP.Constructor;

// constructor

class Human {
    private int age;
    private String name;

    public Human() {
        System.out.println("In constructor ");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
};

public class ConstructorM {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human();
        // obj.age = 11;
        // // obj.name = "bhavesh";

        obj.setAge(122);
        obj.setName("lalalal");

        System.out.println(obj.getName() + obj.getAge());
    }

}