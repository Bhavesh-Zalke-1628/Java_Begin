
// constructor

class Human {
    private int age;
    private String name;

    public Human() {
        System.out.println("hello");
    }

    public void show() {
        System.out.println("blablablablab");
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
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

public class ParameterConst {
    public static void main(String[] args) {
        // Human obj = new Human();
        // Human obj1 = new Human(21, "bhavesh");
        // // obj.age = 11;
        // // // obj.name = "bhavesh";

        // System.out.println(obj.getName() + obj.getAge());
        // System.out.println(obj1.getName() + obj1.getAge());

        // ananonnmous object
        new Human().show();
    }

}