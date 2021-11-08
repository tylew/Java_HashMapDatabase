/**
* @author Tyler Lewis
* @version 1.0`
* tylewis@chapman.edu
*/

public class PartTime extends Staff{
  /**
 * Hourly wage
 */
protected int wage;

  public PartTime(){
    super();
    wage = 0;
  }

  /**
 * @param name
 * @param age
 * @param address
 * @param phoneNum Phone Number
 * @param yearCame Year came to Chapman
 * @param idNum ID number
 * @param title
 * @param building
 * @param wag Hourly wage
 */
public PartTime(String name, int age, String address, String phoneNum, int yearCame, int idNum, String title, String building, int wag){
    super("Part Time Staff", name, age, address, phoneNum, yearCame, idNum, title, building);
    wage = wag;
  }
  public String toString(){
    String s = super.toString();
    s+="\nHourly wage: " + wage;
    return s;
  }
  public String print() {
  		return "PartTime, " + super.print()+ " , " + wage;
  	  }

/**
 * @return the wage
 */
public int getWage() {
	return wage;
}

/**
 * @param wage the wage to set
 */
public void setWage(int wage) {
	this.wage = wage;
}
}
