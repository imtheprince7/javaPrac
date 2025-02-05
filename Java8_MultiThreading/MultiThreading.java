
class MyRunnable implements Runnable{
    public void run(){
        for(int i=0; i<5; i++)
        {
            System.out.println("Thread Calling....");
        }
    }
}

// public class MultiThreading {
//     public static void main(String[] args) {
//         MyRunnable myrun = new MyRunnable();
//         Thread t = new Thread();
//         myrun.run();
//         t.start();
//         for(int i=0; i<5; i++){
//             System.out.println("Main Thread Calling....");
//         }
        
//     }
// }


    // ===================  BY USING LAMBDA EXPRESSION ================

public class MultiThreading {
        public static void main(String[] args) {
         Runnable rn = () ->{
            for(int i=0; i<7; i++){
              System.out.println("Thread Calling....");
            }
         };
        Thread th = new Thread(rn);
        th.start();
        for(int i=0; i<7; i++){
            System.out.println("Main Thread Calling....");
        }
        
    }
 }