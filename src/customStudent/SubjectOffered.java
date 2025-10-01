package customStudent;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SubjectOffered {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<Student>();
        studentList.add(new Student(101,"Anchal","Math",60.3));
        studentList.add(new Student(102,"Daniel","Math",80.4));
        studentList.add(new Student(103,"Shusma","English",50.4));
        studentList.add(new Student(104,"Deepa","Hindi",90.4));
        studentList.add(new Student(102, "Rahul", "Science", 72.5));
        studentList.add(new Student(103, "Neha", "English", 55.8));
        studentList.add(new Student(104, "Amit", "History", 80.0));

       Set<String> offeredSubjects = studentList.stream().
                                     map(Student::getSubject).collect(Collectors.toSet());
        System.out.println(offeredSubjects);


        //java 7
        Set<String> subjects=new HashSet<>();
        for(Student s :studentList){
            subjects.add(s.getSubject());
        }
        System.out.println("Offered subjects : ");
        System.out.println(subjects);
    }
}
