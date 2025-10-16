package simpleCoding;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import customEmployee.Employee;

public class Test {
    public static void main(String[] args) {
    	Employee e1 = new Employee(101, "Ashish", 28, "Male", "IT", 2020, 55000.50);
		Employee e2 = new Employee(102, "Deepa", 26, "Female", "HR", 2021, 48000.00);
		Employee e3 = new Employee(103, "Ash", 28, "Male", "IT", 2020, 55000.50);
		List<Employee>employeeList =Arrays.asList(e1,e2,e3);
		
		Employee emp = employeeList.stream().filter(x->"IT".equalsIgnoreCase(x.getDepartment()))
		                    .sorted(Comparator.comparing(Employee::getSalary)).skip(1).findFirst().get();
		System.out.println(emp);
		
    }
}
