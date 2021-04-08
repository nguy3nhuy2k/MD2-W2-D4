package Student;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student("aaaaa",111);
        Student s2 = new Student("bbbbb",222);
        Student s3 = new Student("ccccc",333);
        s1.display();
        s2.display();
        s3.display();
    }
}
