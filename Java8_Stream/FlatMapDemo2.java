package Java8_Stream;

import java.util.Arrays;
import java.util.List;

class Student{
    int studentId;
    String studentName;
    int studentRollNo;

    Student(){

    }
    Student(int studentId, String studentName, int studentRollNo){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
    }
}


public class FlatMapDemo2 {

// *****************  By defalt Stream process the data(object) SEQUENTIALLY **************************
    public static void main(String[] args) {
        List<Student> student1 = Arrays.asList(
            new Student(101,"Prince Kumar",30),
            new Student(102,"Prince Patel",31),
            new Student(103,"Racheal Infat",32),
            new Student(104,"Gopal Dass",33)
        );

        List<Student> student2 = Arrays.asList(
            new Student(107,"Ansh Rajpot",8),
            new Student(108,"Amit Kumar",6),
            new Student(109,"Atul Singh",14),
            new Student(110,"Srimayi Singh",37)
        );

        List<List<Student>> totalStudent = Arrays.asList(student1,student2);

        totalStudent.stream().flatMap(s->s.stream()).filter(id->id.studentId>106).forEach(name->System.out.print(name.studentName+" "));
    }
}
