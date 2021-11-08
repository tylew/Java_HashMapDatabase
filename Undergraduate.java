/**
* @author Tyler Lewis
* @version 1.0`
* tylewis@chapman.edu
*/

public class Undergraduate extends Student{

  /**
 * integer representing number of courses
 */
protected int numCourses;
  /**
 * integer representing scholarship Amount
 */
protected int scholarshipAmount;

  public Undergraduate(){
     super();
     numCourses = 0;
     scholarshipAmount = 0;
  }

  /**
 * @param name
 * @param age
 * @param address
 * @param phoneNum phone Number
 * @param yearCame Year came to Chapman
 * @param idNum ID Number
 * @param major
 * @param minor
 * @param classStanding String Class Standing
 * @param nc int Number of courses
 * @param sa int scholarship amount
 */
public Undergraduate(String name, int age, String address, String phoneNum, int yearCame, int idNum, String major, String minor, String classStanding, int nc, int sa){
    super("Undergraduate", name, age, address, phoneNum, yearCame, idNum, major, minor, classStanding);
    numCourses = nc;
    scholarshipAmount = sa;
  }
  public String toString(){
    String s = super.toString();
    s+="\nNumber of courses: " + numCourses;
    s+="\nScholarship Amount: " + scholarshipAmount;
    return s;
  }

public String print() {
    		return "Undergraduate, " + super.print()+ " , " + numCourses + " , " + scholarshipAmount;
  }

/**
 * @return
 */
public int getNumCourses() {
	return numCourses;
}

/**
 * @param numCourses
 */
public void setNumCourses(int numCourses) {
	this.numCourses = numCourses;
}

/**
 * @return
 */
public int getScholarshipAmount() {
	return scholarshipAmount;
}

/**
 * @param scholarshipAmount
 */
public void setScholarshipAmount(int scholarshipAmount) {
	this.scholarshipAmount = scholarshipAmount;
}
}
