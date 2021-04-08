package Student;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";


     Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
    static  void change(){
        college = "Codegym";
    }
    void display(){
        System.out.println(rollno + "  " + name + "  " + college);
    }


}
