// Wrap up over the data 

class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String n) {
        name = n;
    }
};

public class ThisKey {
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.age = 11;
        // // obj.name = "bhavesh";

        obj.setAge(122);
        obj.setName("lalalal");

        System.out.println(obj.getName() + obj.getAge());
    }

}