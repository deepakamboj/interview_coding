package customStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PercentageAbove60 {
    public static void main(String[] args) {

        List<Student> studentList=new ArrayList<Student>();
        studentList.add(new Student(101,"Anchal","Math",60.3));
        studentList.add(new Student(102,"Daniel","Math",80.4));
        studentList.add(new Student(103,"Shusma","English",50.4));
        studentList.add(new Student(104,"Deepa","Hindi",90.4));
        studentList.add(new Student(102, "Rahul", "Science", 72.5));
        studentList.add(new Student(103, "Neha", "English", 55.8));
        studentList.add(new Student(104, "Amit", "History", 80.0));

//        Map<Boolean, List<Student>> abovepercentage = studentList.stream()
//                                  .collect(Collectors.partitioningBy(s->s.getPercentage()>60));
//        System.out.println("Student above 60 percentage :");
//        abovepercentage.get(true).forEach(System.out::println);
        List<Student> sList = studentList.stream()
                .filter(s->s.getPercentage()>60).toList();
        sList.forEach(System.out::println);

        List<Student> firstDiv = new ArrayList<>();
        for(Student s: sList){
            if(s.getPercentage()>60){
                firstDiv.add(s);
            }
        }
        System.out.println("First Div : ");
        firstDiv.forEach(System.out::println);
    }

}
