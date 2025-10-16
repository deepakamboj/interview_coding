package customStudent;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TopThree {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<Student>();
        studentList.add(new Student(101,"Anchal","Math",60.3));
        studentList.add(new Student(102,"Daniel","Math",80.4));
        studentList.add(new Student(103,"Shusma","English",50.4));
        studentList.add(new Student(104,"Deepa","Hindi",90.4));
        studentList.add(new Student(102, "Rahul", "Science", 72.5));
        studentList.add(new Student(103, "Neha", "English", 55.8));
        studentList.add(new Student(104, "Amit", "History", 80.0));

        List<Student> top3Student = studentList.stream()
                               .sorted(Comparator.comparing(Student::getPercentage).reversed())
                               .limit(3)
                               .collect(Collectors.toList());
        top3Student.forEach(System.out::println);

        //java 7
        int top=0;
        List<Student> list = new ArrayList<>();
        for(Student s:studentList){
            list.add(s);
            list.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed());
          top++;
          if(top==3){
              break;

          }
        }
       System.out.println("Top three students : ");
        list.forEach(System.out::println);
    }
}
