package com.mika;

import com.mika.bean.Employee;

import java.util.ArrayList;
import java.util.List;

public class SourceData {

    public static List getNameList() {
        List<String> names = new ArrayList<>();
        names.add("Maria");
        names.add("Sofia");
        names.add("Aurora");
        names.add("Olivia");
        names.add("Emilia");
        names.add("Aino");
        names.add("Matilda");
        names.add("Amanda");
        return names;
    }

    public static List<Employee> getEmployeeList() {
        return List.of(
                new Employee("John Smith", 20000),
                new Employee("Susan Johnson", 42000),
                new Employee("Erik Taylor", 55_000),
                new Employee("Zack Anderson", 14_000),
                new Employee("Sarah Lewis", 130_000)
        );
    }

}
