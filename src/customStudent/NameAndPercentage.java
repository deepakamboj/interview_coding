package customStudent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NameAndPercentage {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<Student>();
        studentList.add(new Student(101,"Anchal","Math",60.3));
        studentList.add(new Student(102,"Daniel","Math",80.4));
        studentList.add(new Student(103,"Shusma","English",50.4));
        studentList.add(new Student(104,"Deepa","Hindi",90.4));
        studentList.add(new Student(102, "Rahul", "Science", 72.5));
        studentList.add(new Student(103, "Neha", "English", 55.8));
        studentList.add(new Student(104, "Amit", "History", 80.0));
        Map<String,Double> namePercentageMap = studentList.stream()
                .collect(Collectors.toMap(Student::getName,Student::getPercentage));
        namePercentageMap.forEach((name,percentage)-> System.out.println(name+" "+percentage));


        Map<String,Double> percentage = new HashMap<String,Double>();
        for( Student student: studentList){
            percentage.put(student.getName(),student.getPercentage());//if two student with same name,this logic not work
        }
       // System.out.println(percentage);
        percentage.forEach((key,value)->System.out.println(key+" "+value));
    }
}
