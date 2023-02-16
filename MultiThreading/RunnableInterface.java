package MultiThreading;

class Demo implements Runnable {
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(i+" ");
            try {
                Thread.sleep(1000);
            } catch(Exception e) {
            }
            
        }
    }
}

class DemoRun implements Runnable{
    public void run(){
        for(int i=10; i>=5; i--){
            System.out.println(i+" "); 
            try {
                //Thread.sleep(2000);
            } catch(Exception e) {
            }
            
        }
    }
}

public class RunnableInterface {
        public static void main(String[] args) {
            
            Runnable dd = new Demo();
            Runnable md = new DemoRun();

            Thread t1 = new Thread(dd);
            Thread t2 = new Thread(md);
            t1.start();
            t2.start();
        
        }
    }