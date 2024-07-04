package Package;
import java.util.ArrayList;

public class College {  // Changed the class name from ArrayList_classCollection to College
    String name;
    int age;
    int rollno;
    String gmail;
    String course;

    // Constructor name should match the class name
    College(String name, int age, int rollno, String gmail, String course) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        this.gmail = gmail;
        this.course = course;
    }

    public void getInfo() {
        System.out.println("Student name : " + name);
        System.out.println("Student Age : " + age);
        System.out.println("Student rollno : " + rollno);
        System.out.println("Student gmail : " + gmail);
        System.out.println("Student course : " + course);
    }

    public static void main(String[] args) {
        ArrayList<College> student = new ArrayList<College>();
        College std1 = new College("Shanmukh", 21, 14, "thalabathula.shanmukh04@gmail.com", "CSM");
        College std2 = new College("Om sri", 21, 07, "Omsri@gmail.com", "CSM");
        College std3 = new College("Pavan", 21, 11, "Pavan@gmail.com", "CSM");

        student.add(std1);
        student.add(std2);
        student.add(std3);

        for (int i = 0; i < student.size(); i++) {
            student.get(i).getInfo();
            System.out.println();
        }
    }
}
