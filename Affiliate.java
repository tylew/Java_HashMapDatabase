/**
* @author Tyler Lewis
* @version 1.0`
* tylewis@chapman.edu
*/

public abstract class Affiliate{
  /**
 * Type of Affiliate
 */
protected String type;

protected String name;


protected int age;

protected String address;
  /**
 * Phone Number
 */
protected String phoneNumber;
/**
 * Year came to Chapman
 */
protected int yearCame;

public Affiliate(){
    type = null;
    name = null;
    age = 0;
    address = null;
    phoneNumber = null;
    yearCame = 0;
  }

  /**
 * @param t String type
 * @param n String name
 * @param ag Integer age
 * @param ad String address
 * @param pn String Phone Number
 * @param yc String year came to Chapman
 */
public Affiliate(String t, String n, int ag, String ad, String pn, int yc){
    type = t;
    name = n;
    age = ag;
    address = ad;
    phoneNumber = pn;
    yearCame = yc;
  }

  /**
 * @return String of attributes in a print friendly way
 */
public String toString(){
    String s = "\nName: " + name;
    s+= "\nAddress: " + address;
    s+= "\nAge: " + age;
    s+= "\nPhone Number: " + phoneNumber;
    s+= "\nYear came to Chapman: " + yearCame;
    return s;
  }
  /**
 * @return String of attributes separated by commas in alphabetical order
 */
public String print(){
    return address + " , "+ age + " , " + name + " , " + phoneNumber +" , " + yearCame;
  }


/**
 * @return name
 */
public String getName() {
  	return name;
  }
  /**
 * @param m_name
 */
public void setName(String m_name) {
  	this.name = m_name;
  }
  /**
 * @return age
 */
public int getAge() {
  	return age;
  }
  /**
 * @param m_age
 */
public void setAge(int m_age) {
  	this.age = m_age;
  }
  /**
 * @return address
 */
public String getAddress() {
  	return address;
  }
  /**
 * @param m_address
 */
public void setAddress(String m_address) {
  	this.address = m_address;
  }
  /**
 * @return
 */
public String getPhoneNumber() {
  	return phoneNumber;
  }
  /**
 * @param m_phoneNumber
 */
public void setPhoneNumber(String m_phoneNumber) {
  	this.phoneNumber = m_phoneNumber;
  }
  /**
 * @return
 */
public int getYearCameToChapman() {
  	return yearCame;
  }
  /**
 * @param m_yearCameToChapman
 */
public void setYearCameToChapman(int m_yearCameToChapman) {
  	this.yearCame = m_yearCameToChapman;
  }
/**
 * @return the type
 */
public String getType() {
	return type;
}
/**
 * @param type the type to set
 */
public void setType(String type) {
	this.type = type;
}
/**
 * @return the yearCame
 */
public int getYearCame() {
	return yearCame;
}
/**
 * @param yearCame the yearCame to set
 */
public void setYearCame(int yearCame) {
	this.yearCame = yearCame;
}
}
