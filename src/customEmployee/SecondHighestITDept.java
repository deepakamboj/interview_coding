package customEmployee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestITDept {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Ashish", 28, "Male", "IT", 2020, 55000.50);
		Employee e2 = new Employee(102, "Deepa", 26, "Female", "HR", 2021, 48000.00);
		Employee e3 = new Employee(103, "Ash", 28, "Male", "IT", 2020, 55000.50);
		List<Employee>employeeList =Arrays.asList(e1,e2,e3);
		Employee secondHighest = employeeList.stream()
                .filter(e -> "IT".equalsIgnoreCase(e.getDepartment()))     // ✅ filter IT dept
                .sorted(Comparator.comparing(Employee::getSalary)    // ✅ sort by salary
                        .reversed())
                .skip(1)                                                  // ✅ skip highest
                .findFirst()                                              // ✅ get second highest
                .orElse(null); 
		System.out.println(secondHighest);
	}

}
