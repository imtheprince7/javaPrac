public class Demo {
    int id;
    int rollno;
    float courseFee;
    String name;
    public static void main(String[] args) {
        Demo demo = new Demo();
        float datas=0.9f ;
        System.out.println("Default value of class-level variable");
        System.out.println( "Id"+" "+
            demo.id +"\n"+ "Course Fees"+" "+demo.courseFee+"\n"+
            "Name "+" "+demo.name +" "
        );
        
        System.out.println(((Object)datas).getClass().getSimpleName());
    }    
}
