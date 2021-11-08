/**
* @author Tyler Lewis
* @version 1.0`
* tylewis@chapman.edu
*/

public class Graduate extends Student{

  /**
 * Number of papers written
 */
protected int numPapers;
  /**
 * Advisor
 */
protected String advisor;

  public Graduate(){
     super();
     numPapers = 0;
     advisor = "";
  }

  /**
 * @param name
 * @param age
 * @param address
 * @param phoneNum
 * @param yearCame Year came to Chapman
 * @param idNum ID number
 * @param major
 * @param minor
 * @param classStanding
 * @param np Number of Papers
 * @param ad Advisor
 */
public Graduate(String name, int age, String address, String phoneNum, int yearCame, int idNum, String major, String minor, String classStanding, int np, String ad){
    super("Graduate", name, age, address, phoneNum, yearCame, idNum, major, minor, classStanding);
    numPapers = np;
    advisor = ad;
  }


  public String toString(){
    String s = super.toString();
    s+= "\nAdvisor: " + advisor;
    s+="\nNumber of papers: " + numPapers;
    return s;
  }
  public String print() {
  	return "Graduate, " + super.print()+ " , " + advisor+ " , " + numPapers;
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

/**
 * @return the advisor
 */
public String isAdvisor() {
	return advisor;
}

/**
 * @param advisor the advisor to set
 */
public void setAdvisor(String advisor) {
	this.advisor = advisor;
}

}
