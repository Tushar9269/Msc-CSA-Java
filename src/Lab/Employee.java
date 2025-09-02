package Lab;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private String employeeId;
    private String dateOfBirth;
    private double salary;
    private String designation;
    private accountTypes accountType;

    Employee(String id){
        this.employeeId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public accountTypes getAccountType() { return accountType; }

    public void setAccountType(accountTypes accountType) { this.accountType = accountType; }

    public String toString(){
        return "\n Employee Details: \n EmployeeID: " + getEmployeeId() + "\n Employee Name: " + getName() + "\n Employee Designation: " + getDesignation() + "\n Employee DOB: " + getDateOfBirth() + "\n Employee Salary: " + getSalary();
    }
}
