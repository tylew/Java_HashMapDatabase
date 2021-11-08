/**
* @author Tyler Lewis
* @version 1.0`
* tylewis@chapman.edu
*/

public class FullProfessor extends Faculty{

  /**
 * Years until retirement
 */
protected int untilRetire;

  public FullProfessor(){
    super();
    untilRetire = 0;
  }

  /**
 * @param name
 * @param age
 * @param address
 * @param phoneNum Phone number
 * @param yearCame year came to chapman
 * @param idNum ID number
 * @param department
 * @param salary
 * @param numPapers Number of papers written
 * @param ur Years until retirement
 */
public FullProfessor(String name, int age, String address, String phoneNum, int yearCame, int idNum, String department, int salary, int numPapers, int ur){
    super("Full Professor", name, age, address, phoneNum, yearCame, idNum, department, salary, numPapers);
    untilRetire = ur;
  }
  public String print() {
     return "FullProfessor, " + super.print()+ " , " + untilRetire;
  }
  public String toString(){
    String s = super.toString();
    s+= "\nYears until retired: " + untilRetire;
    return s;
  }

/**
 * @return the untilRetire
 */
public int getUntilRetire() {
	return untilRetire;
}

/**
 * @param untilRetire the untilRetire to set
 */
public void setUntilRetire(int untilRetire) {
	this.untilRetire = untilRetire;
}


}
