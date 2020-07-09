
public class Employee {
    private String name;
    private double salary;

    public Employee(){
        name = "";
        salary = 0.0;
    }
    
    public Employee(String employeeName){
        name = employeeName;
        salary = 0.0;
    }
    
    public Employee(String employeeName, double currentSalary) {
    	name = employeeName;
    	salary = currentSalary;    	
    }
    
    public void raiseSalary(double percent){
    	salary = salary + (salary * percent / 100.0);
    }
    
    public String getName(){
    	return name;
    }
    
    public void setName(String n){
    	name = n;
    }
    
    public double getSalary(){
    	return salary;
    }
    
    public void setSalary(double amount){
    	salary = amount;
    }
}
}
