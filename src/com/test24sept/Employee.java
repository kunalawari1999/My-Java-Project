package com.test24sept;
class Department {
	String name;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
class Employee {
  private int id;
  private String name="HI";
  private Boolean ismanager;
  private float salary;
 private Department dept;

  public void setId(int id) {
	  this.id=id;
  }
  public void setName(String name) {
	  this.name=name;
  }
  public void setIsmanager(Boolean ismanager) {
	  this.ismanager=ismanager;
  }
  public void setSalary(float salary) {
	  this.salary=salary;
  }
  public void setDept(Department dept) {
	  this.dept=dept;
  }
  public int getId() {
	  return id;
  }
  public String getName() {
	  return name;  
  }
  public Boolean getIsmanager() {
	  return ismanager;
  }
  public float getSalary() {
	  return salary;
  }
  public Department getDept () {
	  return dept;
  }
  public static void main(String []args) {
	 Employee a=new Employee();
	 a.setId(123);
	 a.setName("XYZ");
	 a.setIsmanager(false);
	 a.setSalary(50000);
     a.setDept(new Department());
     a.getDept().setName("Market");
     System.out.println(a.getId()+" "+a.getName()+" "+a.getIsmanager()+" "+a.getSalary()+" "+a.getDept().getName(
    		 ));
  }
}