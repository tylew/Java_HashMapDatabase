/**
* @author Tyler Lewis
* @version 1.0`
* tylewis@chapman.edu
*/

public abstract class Faculty extends Affiliate{

  //faculty id, department, yearly salary, number of papers
  /**
 * Faculty id
 */
protected int id;
  /**
 * Department
 */
protected String department;
  /**
 * Salary
 */
protected int salary;
  /**
 * Number of papers Written
 */
protected int numPapers;

  public Faculty(){
    super();
    id = 0;
    department = null;
    salary = 0;
    numPapers = 0;
  }

  /**
 * @param type
 * @param name
 * @param age
 * @param address
 * @param phoneNum phone number
 * @param yearCame year came to Chapman
 * @param idNum Faculty ID number
 * @param dep department
 * @param sal salary
 * @param numP number of papers
 */
public Faculty(String type, String name, int age, String address, String phoneNum, int yearCame, int idNum, String dep, int sal, int numP){
    super(type, name, age, address, phoneNum, yearCame);
    id = idNum;
    department = dep;
    salary = sal;
    numPapers = numP;
  }
  public String toString(){
    String s = super.toString();
    s+= "\nDepartment: " + department;
    s+= "\nID number: " + id;
    s+= "\nSalary: "+salary;
    s+= "\nNumber of papers: "+numPapers;
    return s;
  }
  public String print() {
    return super.print()+ " , " + department +" , " + id + " , " + salary;
   }
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the department
 */
public String getDepartment() {
	return department;
}
/**
 * @param department the department to set
 */
public void setDepartment(String department) {
	this.department = department;
}
/**
 * @return the salary
 */
public int getSalary() {
	return salary;
}
/**
 * @param salary the salary to set
 */
public void setSalary(int salary) {
	this.salary = salary;
}
/**
 * @return the numPapers
 */
public int getNumPapers() {
	return numPapers;
}
/**
 * @param numPapers the numPapers to set
 */
public void setNumPapers(int numPapers) {
	this.numPapers = numPapers;
}
}
