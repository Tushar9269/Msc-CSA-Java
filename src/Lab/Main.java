package Lab;

import java.io.*;
import java.util.*;

enum accountTypes {SAVINGS,CURRENT,DMAT}

public class Main implements Serializable {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        EmployeeWriterReader er = new EmployeeWriterReader();
        Map<String,Employee> Employees;
        HashMap<String, Employee> fileEmployees = er.readEmployee();

        if (fileEmployees != null) {
            Employees = fileEmployees;         // Load from file if exists
        } else {
            Employees = new HashMap<>();       // Empty if not
        }

        Employee employee;
        do {
            int i=1;
                try {
                    System.out.println("Do you want to generate Id of Employee #" + (i) + "(yes/no)");
                    String generateId = br.readLine();
                    switch (generateId) {
                        case "yes" -> {
                            employee = getEmployee(i);
                            Employees.put(employee.getEmployeeId(), employee);
                        }
                        case "no" -> {
                            System.out.println("Enter the id of Employee #" + (i));
                            String id = br.readLine();
                            employee = getEmployee(i, id);
                            Employees.put(employee.getEmployeeId(), employee);
                        }
                        default -> System.out.println("Enter the right answer.");
                    }
                } catch (IOException e) {
                    System.out.println("Error occurred while creating employee: " + e.getMessage());
                }
            System.out.println("Do you wish to continue?(yes/no): ");
        }while (Objects.equals(br.readLine(), "yes"));
        er.writeEmployee((HashMap<String, Employee>) Employees);
//        int index = 1;
//        System.out.println("Do you want to display 1.all details 2.Search using a Id:");
//        int display = Integer.parseInt(br.readLine());
//        switch (display) {
//            case 1 -> {
//                System.out.println("\nDetails of Employee: ");
//                for (Employee e : Employees.values()) {
//                    index = getIndex(e, index);
//                }
//            }
//            case 2 -> {
//                System.out.println("Enter the id of employee to search: ");
//                String search = br.readLine();
//                if(Employees.get(search)!=null){
//                    Employee searchEmployee = Employees.get(search);
//                    System.out.println("Employee found with search: " + search);
//                    System.out.println("Employee ID: " + searchEmployee.getEmployeeId());
//                    System.out.println("Employee Name: " + searchEmployee.getAccountHolderName());
//                    System.out.println("Employee Salary: " + searchEmployee.getSalary());
//                    System.out.println("Employee Designation: " + searchEmployee.getDesignation());
//                    System.out.println("Employee Date of Birth: " + searchEmployee.getDateOfBirth());
//                    System.out.println("Account Type of Employee " + index + ": " + searchEmployee.getAccountType());
//                }
//                else{
//                    System.out.println("Employee not found");
//                }
//            }
//        }
        System.out.println("Do you want to retrieve details?(yes/no): ");
        String retrieveDetails = br.readLine();
        switch (retrieveDetails){
            case "yes" -> {
                System.out.println(er.readEmployee());
            }
            case "no" -> {
                System.out.println("Okay bro.");
            }
        }
    }

    private static int getIndex(Employee e, int index) {
        System.out.println("Id of Employee "+ index +": " + e.getEmployeeId());
        System.out.println("Name of Employee "+ index +": " + e.getName());
        System.out.println("Designation of Employee "+ index +": " + e.getDesignation());
        System.out.println("Date of Birth of Employee "+ index +": " + e.getDateOfBirth());
        System.out.println("Salary of Employee "+ index +": " + e.getSalary());
        System.out.println("Account Type of Employee " + index + ": " + e.getAccountType());
        index++;
        return index;
    }

    private static Employee getEmployee(int i) throws IOException {
        Employee emp = new Employee(UUID.randomUUID().toString());
        return getEmployee(i, emp);
    }

    private static Employee getEmployee(int i, String id) throws IOException {
        Employee emp = new Employee(id);
        return getEmployee(i, emp);
    }

    private static Employee getEmployee(int i, Employee emp) throws IOException {
        System.out.println("Enter the name of the employee " +(i)+ ": "  );
        String name = br.readLine();
        emp.setName(name);
        System.out.println("Enter the designation of the employee " +(i)+ ": " );
        String designation = br.readLine();
        emp.setDesignation(designation);
        System.out.println("Enter the Date Of Birth of the employee " +(i)+ ": " );
        String dateOfBirth = br.readLine();
        emp.setDateOfBirth(dateOfBirth);
        System.out.println("Enter the Salary of the employee " +(i)+ ": " );
        double salary = Double.parseDouble(br.readLine());
        emp.setSalary(salary);
        System.out.println("Enter the type of account you want to open: (SAVINGS, CURRENT, DMAT): ");
        try {
            accountTypes myenum = accountTypes.valueOf(br.readLine().toUpperCase());
            emp.setAccountType(myenum);
            switch (myenum) {
                case SAVINGS -> System.out.println("SAVINGS ACCOUNT OPENED");
                case CURRENT -> System.out.println("CURRENT ACCOUNT OPENED");
                case DMAT -> System.out.println("DMAT ACCOUNT OPENED");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("INVALID ACCOUNT TYPE - setting as null");
            emp.setAccountType(null);
        }
        return emp;
    }

}
