package com.mika;


import com.mika.bean.Employee;

import java.util.List;
import java.util.stream.Collectors;

import static com.mika.SourceData.getEmployeeList;

public class Main {

    public static void main(String[] args) {
        filterDemo(SourceData.getNameList());
        mapDemo(SourceData.getNameList());
        System.out.println("***");
        System.out.println(sortDemo(SourceData.getNameList()));
        System.out.println("***");
        System.out.println(getSortedDemo(SourceData.getNameList()));
        System.out.println("Total of the names: " + countDemo(SourceData.getNameList()));
        System.out.println();
        if (matchDemo(SourceData.getNameList(), "A")) System.out.println("Matched!");
        else System.out.println("Not matched!");

        testEmployees(getEmployeeList());

    }

    // example: "1990-1995,2000" -> ["1990", "1995", "2000"] -> validate years -> true | false
    public static void validateTemporal() {
    }

    public static void capitalizeDocument() {
    }

    // Output names that starts with the letter A.
    public static void filterDemo(List<String> names) {
        names.stream()
                .filter((s) -> s.startsWith("A"))
                .forEach(System.out::println);
    }

    // Output uppercase the names that starts with the letter A.
    public static void mapDemo(List<String> names) {
        names.stream()
                .filter((s) -> s.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    public static List<String> sortDemo(List<String> names) {
        return names.stream()
                .sorted()
                .filter((s) -> s.startsWith("A"))
                .map(String::toUpperCase)
                .peek(System.out::println)
                //.forEach(System.out::println);
                .collect(Collectors.toList());
    }
    // Output sorted and uppercase the names that starts with the letter A.

    // Return sorted and uppercase the names that starts with the letter A.
    public static List<String> getSortedDemo(List<String> names) {
        return names.stream()
                .sorted()
                .filter((s) -> s.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    // Return count to the names that starts with the letter A.
    public static long countDemo(List<String> names) {
        return names.stream()
                .filter((s) -> s.startsWith("A"))
                .count();
    }

    public static boolean matchDemo(List<String> names, String match) {
        return names.stream()
                .anyMatch((s) -> s.startsWith(match));
    }

    public static void testEmployees(List<Employee> employees) {
        employees.stream()
                .filter(employee -> employee.getSalary() < 80000)
                .map(employee ->  new Employee(employee.getName(), employee.getSalary()))
                .forEach(s -> System.out.println(s.getName() + " " + s.getSalary()));
        //.collect(Collectors.toList());
    }

}


