/**
* @author Tyler Lewis
* @version 1.0`
* tylewis@chapman.edu
*/

public abstract class Student extends Affiliate{
  //student id, major, minor, class standing
  /**
 *  Student ID
 */
protected int id;
  protected String major;
  protected String minor;
  protected String classStanding;

  public Student(){
    super();
    id = 0;
    major = null;
    minor = null;
    classStanding = "";
  }

  /**
 * @param type
 * @param name
 * @param age
 * @param address
 * @param phoneNum
 * @param yearCame Year came to Chapman
 * @param idNum ID number
 * @param maj Major
 * @param min
 * @param cs
 */
public Student(String type, String name, int age, String address, String phoneNum, int yearCame, int idNum, String maj, String min, String cs){
    super(type, name, age, address, phoneNum, yearCame);
    id = idNum;
    major = maj;
    minor = min;
    classStanding = cs;
  }

  public String toString(){
    String s = super.toString();
    s+= "\nClass standing: " + classStanding;
    s+= "\nID number: " + id;
    s+= "\nMajor: " + major;
    s+= "\nMinor: " + minor;
    return s;
  }
  public String print() {
  		return super.print()+ " , " + classStanding + " , " + id + " , " + major + " , "+ minor;
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
 * @return the major
 */
public String getMajor() {
	return major;
}

/**
 * @param major the major to set
 */
public void setMajor(String major) {
	this.major = major;
}

/**
 * @return the minor
 */
public String getMinor() {
	return minor;
}

/**
 * @param minor the minor to set
 */
public void setMinor(String minor) {
	this.minor = minor;
}

/**
 * @return the classStanding
 */
public String getClassStanding() {
	return classStanding;
}

/**
 * @param classStanding the classStanding to set
 */
public void setClassStanding(String classStanding) {
	this.classStanding = classStanding;
}
}
