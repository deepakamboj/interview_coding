package customStudent;

import java.util.*;
import java.util.stream.Collectors;

public class GroupBySubject {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<Student>();
        studentList.add(new Student(101,"Anchal","Math",60.3));
        studentList.add(new Student(102,"Daniel","Math",80.4));
        studentList.add(new Student(103,"Shusma","English",50.4));
        studentList.add(new Student(104,"Deepa","Hindi",90.4));
        studentList.add(new Student(105, "Rahul", "Science", 72.5));
        studentList.add(new Student(106, "Neha", "English", 55.8));
        studentList.add(new Student(107, "Amit", "History", 80.0));

//        Map<String,List<Student>> groupBySubjects = studentList.stream()
//                .collect(Collectors.groupingBy(Student::getSubject));
//
//        groupBySubjects.forEach((subject,student)->System.out.println(subject+" "+student));
//        System.out.println(groupBySubjects);

        // var groupBySubject = studentList.stream()
        //        .collect(Collectors.groupingBy(Student::getSubject)); will also works

        studentList.stream()
                .collect(Collectors.groupingBy(Student::getSubject)).entrySet().forEach(System.out::println);
        //java 7
        Map<String,Student> groupMap =  new HashMap<>();
        for(Student s : studentList){
            groupMap.put(s.getSubject(),s);
        }
        System.out.println("======java 7========");
        groupMap.forEach((key,value)->System.out.println(key+"==>"+value));
        
        
    }
}
