package Stream;

import java.util.ArrayList;

public class College {
    ArrayList<Student> students;

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void generateStudents(){
        students = new ArrayList<>();
        students.add(new Student(101,"Tushar",21,"Male"));
        students.add(new Student(102,"Shruthy",24,"Female"));
        students.add(new Student(103,"Teju",23,"Female"));
        students.add(new Student(104,"Michael",23,"Male"));
        students.add(new Student(105,"Chris",20,"Male"));

    }

//    public void setStudents(ArrayList<Student> students) {
//        this.students = students;
//    }
}
