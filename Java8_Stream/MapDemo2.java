package Java8_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int employeeId;
    String employeeName;
    int employeeSalary;

    Employee(){

    }
    public Employee(int employeeId, String employeeName, int employeeSalary){
        this.employeeId= employeeId;
        this.employeeName=employeeName;
        this.employeeSalary= employeeSalary;        
    }
}

public class MapDemo2 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(101,"Akshara",29000),
            new Employee(102,"Priya",34000),
            new Employee(103,"Surbhi",35000),
            new Employee(104,"Rajeev",41000),
            new Employee(105,"Rupesh",55000),
            new Employee(106,"Divya",25000),
            new Employee(107,"Riya",17000)
        );

        employees.stream().filter(n-> n.employeeSalary>30000).map(sal-> sal.employeeSalary*2).collect(Collectors.toList()).forEach(sal->System.out.print(sal+" "));


    }    
}
