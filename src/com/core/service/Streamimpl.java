package com.core.service;

import com.core.value.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streamimpl {


    static List<Employee> employeelist = new ArrayList<Employee>();


    public static void addingvlueToEmployee() {

        Employee e1 = new Employee("Rakesh", "A", 1, 1000, "Tata", "physics");
        Employee e2 = new Employee("Rakesh", "M", 2, 2000, "Wipro", "Chemistry");
        Employee e3 = new Employee("Rakesh", "B", 3, 300, "CTS", "Botany");
        Employee e4 = new Employee("Gautam", "C", 4, 4000, "wfg", "Zoology");
        Employee e5 = new Employee("Arun", "E", 5, 500, "jpmorga", "Math");
        Employee e6 = new Employee("Prakash", "F", 6, 6000, "cgi", "statistics");

        employeelist.add(e1);
        employeelist.add(e2);
        employeelist.add(e3);
        employeelist.add(e4);
        employeelist.add(e5);
        employeelist.add(e6);

        if (!employeelist.isEmpty()) {
            employeelist.forEach(Employee::toString);
        }

    }

    public static void filteroperation()
    {

        if (!employeelist.isEmpty()) {
            List<Employee>  empfilter = employeelist.stream().filter
                    (employee -> employee.getCompany().equalsIgnoreCase("wipro"))
                    .collect(Collectors.toList());
            empfilter.forEach(employee -> System.out.println(employee.toString()+"\n"));
            employeelist.stream().filter(employee -> employee.getFirstname().equalsIgnoreCase("Rakesh"))
                    .limit(2).collect(Collectors.toList()).forEach(employee -> System.out.println("filter limit : "+employee.toString()));
        }
    }

    public static void mapOperation() {
        addingvlueToEmployee();



    }
}
