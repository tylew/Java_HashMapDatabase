/**
* @author Tyler Lewis
* @version 1.0`
* tylewis@chapman.edu
*/

public class AssociateProfessor extends Faculty{

  /**
 * Years from tenure
 */
protected int fromTenure;

  public AssociateProfessor(){
    super();
    fromTenure = 0;
  }

  /**
 * @param name
 * @param age
 * @param address
 * @param phoneNum Phone Number
 * @param yearCame Year Came to chapman
 * @param idNum ID Number
 * @param department
 * @param salary
 * @param numPapers
 * @param ft Years from tenure
 */
public AssociateProfessor(String name, int age, String address, String phoneNum, int yearCame, int idNum, String department, int salary, int numPapers, int ft){
    super("Associate Professor", name, age, address, phoneNum, yearCame, idNum, department, salary, numPapers);
    fromTenure = ft;
  }

  public String toString(){
    String s = super.toString();
    s+= "\nYears from tenure: " + fromTenure;
    return s;
  }
public String print() {
  return "AssociateProfessor, " + super.print()+ " , " + fromTenure;
  }

/**
 * @return the fromTenure
 */
public int getFromTenure() {
	return fromTenure;
}

/**
 * @param fromTenure the fromTenure to set
 */
public void setFromTenure(int fromTenure) {
	this.fromTenure = fromTenure;
}


}
