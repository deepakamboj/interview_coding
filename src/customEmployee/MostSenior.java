package customEmployee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MostSenior {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101,"Deepa",35,"Female","IT",2020,80000));
        employeeList.add(new Employee(102,"Priyanka",25,"Female","IT",1992,60000));
        employeeList.add(new Employee(103,"Gaurav",34,"male","IT",2000,200000));
        employeeList.add(new Employee(104,"Ravinder",39,"male","Mechnical",2015,80000));
        employeeList.add(new Employee(105,"Anchal",38,"Female","Microbio",1996,50000));
        employeeList.add(new Employee(106,"Ashish",25,"male","marketing",2021,30000));
        employeeList.add(new Employee(107,"Deepak",42,"male","SolarEnergy",2025,30000));

       Optional<Employee> senior1 = employeeList.stream()
               .collect(Collectors.minBy(Comparator.comparingInt(Employee::getYearOfJoining)));
        System.out.println(senior1.get());

        Optional<Employee> senior2 = employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
        System.out.println(senior2);

        Optional<Employee> senior3 = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        System.out.println(senior3);
    }
}
