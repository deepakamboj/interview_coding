package customStudent;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class HighLowAvgPercentage {

    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<Student>();
        studentList.add(new Student(101,"Anchal","Math",60.3));
        studentList.add(new Student(102,"Daniel","Math",80.4));
        studentList.add(new Student(103,"Shusma","English",50.4));
        studentList.add(new Student(104,"Deepa","Hindi",90.4));
        studentList.add(new Student(102, "Rahul", "Science", 72.5));
        studentList.add(new Student(103, "Neha", "English", 55.8));
        studentList.add(new Student(104, "Amit", "History", 80.0));

        DoubleSummaryStatistics studentStats = studentList.stream()
                .collect(Collectors.summarizingDouble(Student::getPercentage));

        System.out.println("Highest Percentage : "+studentStats.getMax());
        System.out.println("Lowest Percentage : "+studentStats.getMin());
        System.out.println("Average Percentage : "+studentStats.getAverage());

        //other simple way

        double max = studentList.stream()
                .mapToDouble(Student::getPercentage)
                .max()
                .orElse(0.0);

        double min = studentList.stream()
                .mapToDouble(Student::getPercentage)
                .min()
                .orElse(0.0);

        double avg = studentList.stream()
                .mapToDouble(Student::getPercentage)
                .average()
                .orElse(0.0);

        System.out.println("Highest Percentage : " + max);
        System.out.println("Lowest Percentage : " + min);
        System.out.println("Average Percentage : " + avg);

    }
}
