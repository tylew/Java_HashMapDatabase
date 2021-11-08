/**
* @author Tyler Lewis
* @version 1.0`
* tylewis@chapman.edu
*/

public abstract class Staff extends Affiliate{
  /**
 * ID number
 */
protected int id;
protected String title;
protected String building;

  /**
 * Constructor
 */
public Staff(){
    super();
    id = 0;
    title = null;
    building = null;
  }

  /**
 * @param type
 * @param name
 * @param age
 * @param address
 * @param phoneNum
 * @param yearCame year came to Champan
 * @param idNum ID number
 * @param tit title
 * @param bd building
 */
public Staff(String type, String name, int age, String address, String phoneNum, int yearCame, int idNum, String tit, String bd){
    super(type, name, age, address, phoneNum, yearCame);
    id = idNum;
    title = tit;
    building = bd;
  }

  public String toString(){
    String s = super.toString();
    s+= "\nBuilding: " + building;
    s+= "\nID number: " + id;
    s+= "\nTitle: " + title;
    return s;
  }
  public String print() {
    	return super.print()+ " , " + building + " , " + id + " , " + title;
  }

/**
 * @return id
 */
public int getId() {
	return id;
}

/**
 * @param id
 */
public void setId(int id) {
	this.id = id;
}

/**
 * @return title
 */
public String getTitle() {
	return title;
}

/**
 * @param title
 */
public void setTitle(String title) {
	this.title = title;
}

/**
 * @return building
 */
public String getBuilding() {
	return building;
}

/**
 * @param building
 */
public void setBuilding(String building) {
	this.building = building;
}
}
