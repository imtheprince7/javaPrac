package Java8_Stream;

import java.util.Arrays;
import java.util.List;

public class StreamMethod2 {
    // *****************  By defalt Stream process the data SEQUENTIALLY **************************
    public static void main(String[] args) {
        
/*  * findAny()     
    * findFirst()   ---> Both Return Optional class Type result.  

    * concatenating_Stream [ it works similar to flatMap()].
    * Parallel Stream:  

*/

List<String> stringList = Arrays.asList("One","Two","Three","Nine","Five","Six","Two","Seven","Three");

//TO Return first element from the stream if not Empty OtherWise throw Exception // NoSuchElementFound
            System.out.println();
            System.out.println("To find first matching in :"+" "+stringList.stream().findFirst());

// TO Return any element from the stream. if not Empty OtherWise throw Exception // NoSuchElementFound
            System.out.println();
            System.out.println("To find first matching in :"+" "+stringList.stream().findFirst());



/*  Parallel Stream:-   The powerFul Features of stream is that stream pipelines may executes either sequentially
                        or in paralle. All collections support the "parallelStream()" method that returns a possibly
                        parallel stream.


                    When a stream executes in parallel, the Java Runtime divides the stream into multiple sub Stream.
                    The aggreagte operations iterate over and process these sub stream in parallel and then combine the Result.

*/


    }
}
