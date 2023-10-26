package day3;

import java.util.LinkedList;

public class EmployeeDetails {
	String name;
	int Age ;
	int Experience;
	int Seniority;
	float Salary;
	public EmployeeDetails(int Senioritry,int Experience, String name,int age, float Salary) {
		this.Seniority=Senioritry;
		this.Experience=Experience;
		this.name=name;
		this.Age=Age;
		this.Salary=Salary;
		
	
		
	}
	
	@Override
	public String toString() {
		
		return "seniority="+Seniority+" "+"Experiencr= "+Experience+" "+ "name="+name+" "+"Salary="+Salary;
		
	}
	private int compareTo(EmployeeDetails o) {
		return o.name.compareTo(name);
		

	}

	
	class employeedetails{
		public static void main(String[] args) {
			LinkedList<EmployeeDetails> e= new LinkedList<EmployeeDetails>();
			
			EmployeeDetails e1=new EmployeeDetails(1, 5, "hari", 35, 55555);
			EmployeeDetails e2=new EmployeeDetails(4, 9, "krishna",45, 555654);
			EmployeeDetails e3=new EmployeeDetails(14,6, "hari", 35, 555456
					);
			e.add(e1);
			e.add(e2);
			e.add(e3);
				System.out.println(e);
				
			
			
		}
		
		
	}
	
}
