package mypack;

import java.util.ArrayList;

public class Employee 
{
	private int empid;
	private String name;
	
	Employee(){}
	Employee(int id,String nm)
	{
		this.empid = id;
		this.name = nm;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String toString()
	{
		return "Empid: "+this.empid+"\nName: "+this.name;		
	}
	
	
	public boolean equals(Object obj)
	{
		Employee e = (Employee)obj;
		
		if(e.getEmpid() == this.empid && e.getName() == this.name)
			return true;
		
		
		return false;
		
	}
		
	public ArrayList<Employee> createRecord()
	{
		ArrayList<Employee> AL = new ArrayList<Employee>();
		AL.add(new Employee(101,"abc1"));
		AL.add(new Employee(102,"abc2"));
		AL.add(new Employee(103,"abc3"));
		AL.add(new Employee(104,"abc4"));
		AL.add(new Employee(105,"abc5"));
		
		return AL;
	}
	
	
	

}
