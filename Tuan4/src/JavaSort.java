import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student x, Student y) {

        // 1. CGPA cao hon dung truoc
        if (x.getCgpa() < y.getCgpa()) {
            return 1;
        }

        if (x.getCgpa() > y.getCgpa()) {
            return -1;
        }

        // 2. Neu CGPA bang nhau
        // sap xep ten theo A -> Z
        int ten = x.getName().compareTo(y.getName());

        if (ten != 0) {
            return ten;
        }

        // 3. Neu ten cung bang nhau
        // ID nho hon dung truoc
        return Integer.compare(x.getId(), y.getId());
    }
}

public class JavaSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            studentList.add(
                    new Student(id, name, cgpa)
            );
        }

        Collections.sort(
                studentList,
                new StudentComparator()
        );

        for (Student student : studentList) {
            System.out.println(student.getName());
        }
    }
}
