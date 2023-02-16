package MultiThreading;

class Demo{
    public void print(){
        for(int i=1; i<=5; i++){
            System.out.println(i+" "); 
            try {
                Thread.sleep(2000);
            } catch(Exception e) {
            }
        }
    }
}

class DemoRun{
    public void printRun(){
        for(int i=10; i>=5; i--){
            System.out.println(i+" ");
        }
    }
}

public class MultiDemo {
    public static void main(String[] args) {
        
        Demo dd = new Demo();
        DemoRun md = new DemoRun();
        dd.print();
        md.printRun();
    }
}
