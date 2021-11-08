/**
* @author Tyler Lewis
* @version 1.0`
* tylewis@chapman.edu
*/

public class FullTime extends Staff{
  /**
 * Salary
 */
protected int salary;

  public FullTime(){
    super();
    salary = 0;
  }

  /**
 * @param name
 * @param age
 * @param address
 * @param phoneNum
 * @param yearCame Year came to Chapman
 * @param idNum ID number
 * @param title
 * @param building
 * @param sal Salary
 */
public FullTime(String name, int age, String address, String phoneNum, int yearCame, int idNum, String title, String building, int sal){
    super("Full Time Staff", name, age, address, phoneNum, yearCame, idNum, title, building);
    salary = sal;
  }
  public String toString(){
    String s = super.toString();
    s+="\nAnnual salary: " + salary;
    return s;
  }
  public String print() {
  	return "FullTime, " + super.print()+ " , " + salary;
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
}
