package org.example;


import org.example.configuration.MyConfig;
import org.example.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
         Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee employee = communication.getEmployee(11);
//        System.out.println(employee);

//        Employee employee = new Employee("Sveta", "Sokolova", "HR", 900);
//        employee.setId(11);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(11);
    }
}
