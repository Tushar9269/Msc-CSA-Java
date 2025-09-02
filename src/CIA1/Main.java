package CIA1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Student> students = new HashMap<>();
        System.out.println("Enter the no of Students: ");
        int studentNo = Integer.parseInt(br.readLine());
        Student student = new Student();

        for (int i = 0; i < studentNo; i++) {
            System.out.println("Enter the id of the Student "+(i+1)+": ");
            int id = Integer.parseInt(br.readLine());
            student.setId(id);
            System.out.println("Enter the name of Student "+(i+1)+": ");
            String name = br.readLine();
            student.setName(name);
            System.out.println("Enter the age of Student "+(i+1)+": ");
            int age = Integer.parseInt(br.readLine());
            student.setAge(age);
            System.out.println("Enter the department of Student "+(i+1)+": ");
            String department = br.readLine();
            student.setDept(department);
            System.out.println("Enter the email of Student "+(i+1)+": ");
            String email = br.readLine();
            student.setEmail(email);
            students.put(String.valueOf(student.getId()),student);
        }

        System.out.println("Enter the id to search: ");
        int id = Integer.parseInt(br.readLine());

            Student student1 = students.get(String.valueOf(id));
            if (student1 != null) {
                System.out.println("ID: " + student1.getId());
                System.out.println("Name: " + student1.getName());
                System.out.println("Age: " + student1.getAge());
                System.out.println("Department: " + student1.getDept());
                System.out.println("Email: " + student1.getEmail());
            }
            else{
                System.out.println("ID not found");
            }
    }
}
