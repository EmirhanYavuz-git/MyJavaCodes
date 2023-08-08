package com.emirhan.task;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {


        //Print all emails
        System.out.println("Print All Emails");
        EmployeeData.readAll()
                .forEach(employee -> System.out.println(employee.getEmpMail()));


        //Print all phone numbers
        System.out.println("Print all phone numbers");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("Print all phone numbers with double colon");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
