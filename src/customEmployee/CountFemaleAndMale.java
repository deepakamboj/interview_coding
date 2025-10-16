package customEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountFemaleAndMale {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101,"Deepa",35,"Female","IT",2020,80000));
        employeeList.add(new Employee(102,"Priyanka",25,"Female","IT",1992,60000));
        employeeList.add(new Employee(103,"Gaurav",34,"male","IT",2000,200000));
        employeeList.add(new Employee(104,"Ravinder",39,"male","Mechnical",2015,80000));
        employeeList.add(new Employee(105,"Anchal",38,"Female","Microbio",1996,50000));
        employeeList.add(new Employee(106,"Ashish",25,"male","marketing",2021,30000));
        employeeList.add(new Employee(107,"Deepak",42,"male","SolarEnergy",2025,30000));

       Map<String,Long> count = employeeList.stream()
               .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
       count.entrySet().stream().forEach(System.out::println);
       System.out.println(count);
        System.out.println(IntStream.range(0, 5).sum());
    }
}
