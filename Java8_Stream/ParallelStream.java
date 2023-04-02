package Java8_Stream;

import java.util.Arrays;
import java.util.List;

/*  Parallel Stream:-   The powerFul Features of stream is that stream pipelines may executes either sequentially
                        or in paralle. All collections support the "parallelStream()" method that returns a possibly
                        parallel stream.


                    When a stream executes in parallel, the Java Runtime divides the stream into multiple sub Stream.
                    The aggreagte operations iterate over and process these sub stream in parallel and then combine the Result.

*/
class Student{
        int score;
        String name;
    Student(){

        }
    Student(int score, String name){
            this.score= score;
            this.name= name;
        }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }

}
public class ParallelStream {
// *****************  By defalt Stream process the data SEQUENTIALLY **************************
    public static void main(String[] args) {
     List<Student> student = Arrays.asList(
                     new Student(75,"Chanchal"),        new Student(85,"Kirtii"),
                     new Student(83,"Akshara" ),        new Student(67, "Kritika"),
                     new Student(69, "Payal"),          new Student(92, "Sachin"),
                     new Student(74, "Prashant"),       new Student(87, "Keshav"),
                     new Student(83,"Sumit"),           new Student(98,"Prince")
                );
// To get Students BOTH "NAME & SCORE" after given condition( score >= X || score <= X) 
// using stream():--- sequentially process
            student.stream().filter(m->m.getScore() >=80).limit(5).forEach(stu-> System.out.println(stu.getName()+" "+stu.getScore()));


// using stream():--- Parallel process
            student.parallelStream().filter(m->m.getScore() >=80).limit(5).forEach(stu-> System.out.println(stu.getName()+" "+stu.getScore()));

// Convert stream() ---> into Parallel Stream().   ---> use parallel() method. just after stream() method.
            student.stream().parallel().filter(m->m.getScore() <=75).limit(5).forEach(stu-> System.out.println(stu.getName()+" "+stu.getScore()));




    }
    
}
