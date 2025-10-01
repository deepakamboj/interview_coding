package customStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TotalStudents {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<Student>();
        studentList.add(new Student(101,"Anchal","Math",60.3));
        studentList.add(new Student(102,"Daniel","Math",80.4));
        studentList.add(new Student(103,"Shusma","English",50.4));
        studentList.add(new Student(104,"Deepa","Hindi",90.4));
        studentList.add(new Student(102, "Rahul", "Science", 72.5));
        studentList.add(new Student(103, "Neha", "English", 55.8));
        studentList.add(new Student(104, "Amit", "History", 80.0));

        Long total = studentList.stream().collect(Collectors.counting());
        System.out.println(total);

        //java 7
        int total2 =0;
        for(Student s:studentList){
          total2++;
        }
        System.out.println(total2);
    }
}
