package com.core.value;

import java.util.Date;

public class Employee {

    String firstname;
    String lastname;
    int id;
    int salary;
    String company;
    String department;
    Date DOB;


    public Employee(String firstname, String lastname, int id,
                    int salary, String company, String department) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.company = company;
        this.department = department;


    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", department='" + department + '\'' +
                ", DOB=" + DOB +
                '}';
    }


}
