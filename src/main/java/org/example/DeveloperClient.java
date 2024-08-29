package org.example;

public class DeveloperClient {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        int salary = employee.salary();
        System.out.println(salary);

        Employee employee1 = EmployeeFactory.getEmployee("WEB DEVELOPER");
        int salary1 = employee1.salary();
        System.out.println(salary1);
    }

    // tight coopling is happening here

    // focus on creating object rather than implementation
    //loose coupling , more robust code

}
