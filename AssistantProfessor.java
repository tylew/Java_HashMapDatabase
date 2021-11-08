/**
* @author Tyler Lewis
* @version 1.0`
* tylewis@chapman.edu
*/

public class AssistantProfessor extends Faculty{

  /**
 * Years until Tenure
 */
protected int untilTenure;

  public AssistantProfessor(){
    super();
    untilTenure = 0;
  }

  /**
 * @param name
 * @param age
 * @param address
 * @param phoneNum Phone number
 * @param yearCame Year came to chapman
 * @param idNum ID Number
 * @param department
 * @param salary
 * @param numPapers number of papers written
 * @param ut years until tenure
 */
public AssistantProfessor(String name, int age, String address, String phoneNum, int yearCame, int idNum, String department, int salary, int numPapers, int ut){
    super("Assistant Professor", name, age, address, phoneNum, yearCame, idNum, department, salary, numPapers);
    untilTenure = ut;
  }
  /**
 *
 */
public String toString(){
    String s = super.toString();
    s+= "\nYears until tenure: " + untilTenure;
    return s;
  }
public String print() {
     return "AssistantProfessor, " + super.print()+ " , " + untilTenure;
  }

/**
 * @return the untilTenure
 */
public int getUntilTenure() {
	return untilTenure;
}

/**
 * @param untilTenure the untilTenure to set
 */
public void setUntilTenure(int untilTenure) {
	this.untilTenure = untilTenure;
}


}
