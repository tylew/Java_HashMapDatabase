import java.io.*;
import java.util.*;
import java.util.Map.Entry;

/**
* @author Tyler Lewis
* @version 1.0`
* tylewis@chapman.edu
*/


public class AffiliateDriver{
  private PrintWriter pw;
  public HashMap<Integer, Affiliate> Affiliates;

  public AffiliateDriver(){
	  Affiliates = new HashMap<Integer, Affiliate>();
	 // pw = new PrintWriter(new FileWriter("AffiliateList.txt"));
  }

  /**
 * Prints affiliates into text file named "AffiliateList.txt"
 */
public void printHashMap(){
	  try{
		  FileWriter fw = new FileWriter("AffiliateList.txt");
	      Iterator<Entry<Integer, Affiliate>> it = Affiliates.entrySet().iterator();
	      Affiliate a;
	      while (it.hasNext()) {
	            Map.Entry pair = (Map.Entry)it.next();
	            a = (Affiliate) pair.getValue();
	            fw.write(a.print());
	            fw.write(System.getProperty( "line.separator" ));
	            System.out.println(a.print());
	        }
	        fw.close();

	      } catch(Exception e){
	        System.err.println("Unable to create log file!");
	      }

  }

  /**
   * restores affiliates from a text file
 * @param fileName
 * @param AffiliateMap
 */
public static void restore(String fileName,HashMap<Integer, Affiliate> AffiliateMap){
  try{
	  FileInputStream fileByteStream = null;
	  String line = "";
	  Scanner scnr = new Scanner(System.in);
	  try{
	    fileByteStream = new FileInputStream(fileName);
	  }catch(FileNotFoundException e){
	    System.err.print("\nFile not found!\n\n");
	  }catch(NullPointerException d){
	    System.err.print("\nUnable to open log file!\n\n Press Enter to continue. \n");
	  }

    AffiliateMap.clear();

	  Scanner inputScnr = new Scanner(fileByteStream);

    while(inputScnr.hasNext()){

	  String[] lineArray = inputScnr.nextLine().split(",");
	  for(int i=0;i<lineArray.length;++i){
	    lineArray[i]=lineArray[i].trim();
	  }
	  String affiliateType = lineArray[0];
    try{
	  String address = lineArray[1];
	  int age = Integer.parseInt(lineArray[2]);
	  String name = lineArray[3];
	  String phoneNumber = lineArray[4];
	  int yearCame = Integer.parseInt(lineArray[5]);
	  String type = lineArray[6]; //Different for each affiliate but represents department/classStanding/building....
	  int id = Integer.parseInt(lineArray[7]);

	  if(affiliateType.equals("Assistant")){
      int salary = Integer.parseInt(lineArray[8]);
      int numPapers = Integer.parseInt(lineArray[9]);
      int untilTenure = Integer.parseInt(lineArray[7]);
      AffiliateMap.put(id,new AssistantProfessor(name, age, address, phoneNumber, yearCame, id, type, salary, numPapers, untilTenure));
	  }if(affiliateType.equals("Associate")){
      int salary = Integer.parseInt(lineArray[8]);
      int numPapers = Integer.parseInt(lineArray[9]);
      int fromTenure = Integer.parseInt(lineArray[10]);
      AffiliateMap.put(id,new AssociateProfessor(name, age, address, phoneNumber, yearCame, id, type, salary, numPapers, fromTenure));
	  }if(affiliateType.equals("Full")){
      int salary = Integer.parseInt(lineArray[8]);
      int numPapers = Integer.parseInt(lineArray[9]);
      int untilRetire = Integer.parseInt(lineArray[10]);
      AffiliateMap.put(id,new FullProfessor(name, age, address, phoneNumber, yearCame, id, type, salary, numPapers, untilRetire));
	  }if(affiliateType.equals("Graduate")){
      String major = lineArray[8];
      String minor = lineArray[9];
      int numPapers = Integer.parseInt(lineArray[10]);
      String advisor = lineArray[11];
      AffiliateMap.put(id,new Graduate(name, age, address, phoneNumber, yearCame, id, major, minor, type, numPapers, advisor));
	  }if(affiliateType.equals("Undergraduate")){
      String major = lineArray[8];
      String minor = lineArray[9];
      int numCourses = Integer.parseInt(lineArray[10]);
      int scholarshipAmount = Integer.parseInt(lineArray[11]);
      AffiliateMap.put(id,new Undergraduate(name, age, address, phoneNumber, yearCame, id, major, minor, type, numCourses, scholarshipAmount));
	  }if(affiliateType.equals("FullTime")){
      String title = lineArray[8];
      int sal = Integer.parseInt(lineArray[9]);
      AffiliateMap.put(id,new FullTime(name, age, address, phoneNumber, yearCame, id, title, type, sal));
	  }if(affiliateType.equals("PartTime")){
      String title = lineArray[8];
      int wage = (int) Double.parseDouble(lineArray[9]);
      AffiliateMap.put(id,new FullTime(name, age, address, phoneNumber, yearCame, id, title, type, wage));
	  }}catch(Exception e){
      System.out.print("Unable to add Affiliate " + affiliateType + ".\n");
    }
}

    System.out.print("\n\nRestored database successfully.\n\n Press Enter to continue.\n");
    scnr.nextLine();
}catch(Exception e){}
	}

  /**
   * Gets choice 1-7 and prompts user to try again if invalid
 * @return int 1-7
 */
public static int getChoice(){
    int choice;
    Scanner scnr = new Scanner(System.in);
    try{
        String input = scnr.nextLine();
        System.out.print("\n");
        int inputInt = Integer.parseInt(input); // throws exception.
        while (inputInt < 1 || inputInt > 7) // If number out of range, try again.
        {
            System.out.println("Invalid option! Please enter a number between 1 and 7.");
            System.out.print("\n--> ");
            input = scnr.nextLine();
            System.out.print("\n");
            inputInt = Integer.parseInt(input);
        }
        choice = inputInt;
    }
    catch (NumberFormatException e){
        System.out.println("Invalid option! Please enter a number between 1 and 7.");
        System.out.print("\n--> ");
        return getChoice();
    }
    return choice;
  }

  /**
   * creates a record
 * @param AffiliateMap
 */
public static void createRecord(HashMap<Integer, Affiliate> AffiliateMap){
	  int choice;
	  int inputInt = 0;
	  boolean g = true;
	  Scanner scnr = new Scanner(System.in);
	  while(g == true){
	  try{
	      String input = scnr.nextLine();
	      System.out.print("\n");
	      inputInt = Integer.parseInt(input); // throws exception.
	      while (inputInt < 1 || inputInt > 7) // If number out of range, try again.
	      {
	          System.out.println("Invalid option! Please enter a number between 1 and 7.");
	          System.out.print("\n--> ");
	          input = scnr.nextLine();
	          System.out.print("\n");
	          inputInt = Integer.parseInt(input);
	      }

	      g = false;
	  }catch (NumberFormatException e){
	      System.out.println("Invalid option! Please enter a number between 1 and 7.");
	      System.out.print("\n--> ");
	  }
	  }
	  choice = inputInt;
    try{
	  System.out.print("\nWhat is your Affiliates name?\n\n--> ");
	  String name = scnr.nextLine();
	  System.out.print("\nWhat is your Affiliates age?\n\n--> ");
	  int age = scnr.nextInt();
	  scnr.nextLine();
	  System.out.print("\nWhat is your Affiliates address?\n\n--> ");
	  String address = scnr.nextLine();
	  System.out.print("\nWhat is your Affiliates phone number?\n\n--> ");
	  String phoneNumber = scnr.nextLine();
	  System.out.print("\nWhat year did your Affiliate come to Chapman?\n\n--> ");
	  int yearCame = scnr.nextInt();
	  scnr.nextLine();
	  System.out.print("\nWhat is your Affiliates ID number?\n\n--> ");
	  int idnum = scnr.nextInt();
	  scnr.nextLine();

	  if (choice<=3){
	    System.out.print("\nWhat department does your Affiliate work in?\n\n--> ");
	    String department = scnr.nextLine();
	    System.out.print("\nWhat is your Affiliates salary?\n\n--> ");
	    int salary = scnr.nextInt();
	    scnr.nextLine();
	    System.out.print("\nHow many papers has your Affiliate written?\n\n--> ");
	    int numPapers=scnr.nextInt();
	    scnr.nextLine();
	    if(choice==1){
	      System.out.print("\nHow many years away until tenure is your Affiliate?\n\n--> ");
	      int untilTenure = scnr.nextInt();
	      scnr.nextLine();
	      AffiliateMap.put(idnum,new AssistantProfessor(name,age,address, phoneNumber,yearCame,idnum,department,salary,numPapers,untilTenure));
	    }if(choice==2){
	      System.out.print("\nHow many years away from tenure is your Affiliate?\n\n--> ");
	      int fromTenure = scnr.nextInt();
	      scnr.nextLine();
	      AffiliateMap.put(idnum,new AssociateProfessor(name,age,address, phoneNumber,yearCame,idnum,department,salary,numPapers,fromTenure));
	    }if(choice==3){
	      System.out.print("\nHow many years away until retirement is your Affiliate?\n\n--> ");
	      int fromRetriement = scnr.nextInt();
	      scnr.nextLine();
	      AffiliateMap.put(idnum,new FullProfessor(name,age,address, phoneNumber,yearCame,idnum,department,salary,numPapers,fromRetriement));
	    }
	  }if(choice>=4&&choice<=5){
	    System.out.print("\nWhat is your Affiliates major?\n\n--> ");
	    String major = scnr.nextLine();
	    System.out.print("\nWhat is your Affiliates minor?\n\n--> ");
	    String minor = scnr.nextLine();
	    System.out.print("\nWhat is your Affiliates class standing?\n\n--> ");
	    String classStanding = scnr.nextLine();
	    if(choice ==4){
	      System.out.print("\nHow many papers has your Affiliate written?\n\n--> ");
	      int numPapers=scnr.nextInt();
	      scnr.nextLine();
	      System.out.print("\nWho is you Affiliates advisor?\n\n--> ");
	      String advisor = scnr.nextLine();
	      AffiliateMap.put(idnum,new Graduate(name,age,address, phoneNumber,yearCame,idnum,major,minor,classStanding,numPapers,advisor));
	    }if(choice==5){
	      System.out.print("\nHow many courses is your Affiliate taking?\n\n--> ");
	      int numCourses = scnr.nextInt();
	      scnr.nextLine();
	      System.out.print("\nWhat is the amount of your Affiliates scholarship?\n\n--> ");
	      int scholarshipAmount = scnr.nextInt();
	      scnr.nextLine();
	      AffiliateMap.put(idnum,new Undergraduate(name,age,address, phoneNumber,yearCame,idnum,major,minor,classStanding,numCourses,scholarshipAmount));
	    }
	  }if(choice>=6){
	    System.out.print("\nWhat is your affiliates title?\n\n--> ");
	    String title = scnr.nextLine();
	    System.out.print("\nWhat building is your Affiliate in?\n\n--> ");
	    String building = scnr.nextLine();
	    if(choice ==6){
	      System.out.print("\nWhat is your affiliates salary?\n\n--> ");
	      int salary = scnr.nextInt();
	      scnr.nextLine();
	      AffiliateMap.put(idnum,new FullTime(name,age,address, phoneNumber,yearCame,idnum,title,building,salary));
	    }
	    if(choice == 7){
	      System.out.print("\nWhat is your affiliates hourly wage?\n\n--> ");
	      int wage = scnr.nextInt();
	      scnr.nextLine();
	      AffiliateMap.put(idnum,new FullTime(name,age,address, phoneNumber,yearCame,idnum,title,building,wage));
	    }
	  }
  }catch(InputMismatchException e){
    System.out.print("\nError occured.\n");
  }
	}

public static void main(String[] args){
	AffiliateDriver a = new AffiliateDriver();
    Scanner scnr = new Scanner(System.in);
    int choice = 1;
    while(choice != 7){
      System.out.print("\nType a number to choose from the following options:\n\n1)Create an affiliate record\n2)Print information for an Affiliate given the id\n3)List all affiliates in order of seniority\n4)Delete a record given the id\n5)Save your database to a file\n6)Restore your database from a file\n7)Exit\n\n--> ");
      choice = getChoice();
      if(choice == 1){
      System.out.print("\nType a number to choose from the following options:\n\n1) Assistant Professor\n2) Associate Professor\n3) Full Professor\n4) Graduate Student\n5) Undergraduate Student\n6) Full-Time Staff\n7) Part-Time Staff\n\n--> ");
      createRecord(a.Affiliates);
    }if(choice == 2){
      System.out.print("What is the ID number for the Affiliate you would like to return?\n\n--> ");
      int search = scnr.nextInt();
      scnr.nextLine();
      if(a.Affiliates.containsKey(search)){
        System.out.print(a.Affiliates.get(search));
        System.out.print("\n\nPress Enter to continue. \n");
        scnr.nextLine();
      }else{
        System.out.print("\nAffiliate with given ID does not exist.\n\n Press Enter to continue. \n");
        scnr.nextLine();
      }
    }if(choice == 3){
      HashMap<Integer, List<String>> seniorityOrder = new LinkedHashMap<Integer, List<String>>();
      ArrayList<Integer> years = new ArrayList<Integer>();
      if(a.Affiliates.isEmpty()){
        System.out.println("Nothing in database!\n\n Press Enter to continue.");
        scnr.nextLine();
      }else{
      for (int key : a.Affiliates.keySet()){
        if(!years.contains(a.Affiliates.get(key).getYearCameToChapman())){
          years.add(a.Affiliates.get(key).getYearCameToChapman());

        }
      }

      Collections.sort(years);

      for(int i = 0; i<years.size();++i){
        seniorityOrder.put(years.get(i),new ArrayList<String>());
      }
      for(int key : seniorityOrder.keySet()){
        for (int key2 : a.Affiliates.keySet()){
          if (a.Affiliates.get(key2).getYearCameToChapman()==key){
            seniorityOrder.get(key).add(a.Affiliates.get(key2).getName()+", ID#" + key2);
          }
        }
      }
      for (int year : seniorityOrder.keySet()){
        System.out.print("\n|"+year + ": ");
        for(int i = 0; i<seniorityOrder.get(year).size() ;++i){
          System.out.print("\n - " + seniorityOrder.get(year).get(i));
        }
      }
      System.out.print("\n\nPress Enter to continue. \n");
      scnr.nextLine();
    }
    }if(choice == 4){
      System.out.print("What is the ID number for the Affiliate you would like to remove?\n\n--> ");
      int search = scnr.nextInt();
      scnr.nextLine();
      if(a.Affiliates.containsKey(search)){
        System.out.print("\n\nAffiliate " + a.Affiliates.get(search).getName() + " successfully removed!\n\n Press Enter to continue. \n");
        a.Affiliates.remove(search);
        scnr.nextLine();
      }else{
        System.out.print("\nAffiliate with given ID does not exist.\n\n Press Enter to continue. \n");
        scnr.nextLine();
      }
    }if(choice == 5){
    	a.printHashMap();

    }if(choice == 6){
    	System.out.print("What is the file name you would like to restore from?\n\n--> ");
      String fileName = scnr.nextLine();
      System.out.print("\n");
    	restore(fileName,a.Affiliates);

    }}

    scnr.close();
    System.out.println("Successfully exit program.\n");

  }

}
