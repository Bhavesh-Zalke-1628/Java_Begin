class Student {
    int roll;
    String name;
    int marks;
};

class ArrayOfObjeect {
    public static void main(String[] args) {
        // int num[] = new int[4];
        // num[0] = 10;
        // num[1] = 20;
        // int i;
        // for (i = 0; i < num.length; i++) {
        // System.out.println(num[i]);
        // }

        Student s1 = new Student();
        s1.roll = 10;
        s1.name = "bha";
        s1.marks = 20;
        Student s2 = new Student();
        s2.roll = 11;
        s2.name = "abc";
        s2.marks = 30;
        Student s3 = new Student();
        s3.roll = 12;
        s3.name = "pqr";
        s3.marks = 40;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for (int i = 0; i < students.length; i++) {
        // System.out.println(students[i].roll);
        // System.out.println(students[i].name);
        // System.out.println(students[i].marks);
        // }

        // Enhance for loop
        // for (Student student : students) {
        // System.out.println(student.name);
        // }

        int num[] = { 1, 2, 4, 4 };

        for (int i : num) {
            System.out.println(i);
        }
    }
}
