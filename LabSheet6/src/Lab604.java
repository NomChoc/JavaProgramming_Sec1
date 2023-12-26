import java.util.*;
public class Lab604 {
	static Scanner input = new Scanner(System.in);
	static String studentID,subID;
	static int subjectID ;
	boolean stdIT,subIT;
	public static void main(String[] args) {
		inputStudent();
	}
	public static void inputStudent() {
		do {
			System.out.print("Enter student ID : ");
			studentID = input.next();
			System.out.print("Enter subject ID : ");
			subjectID = input.nextInt();
			subID = subjectID+ "";
		}while(!isLength(studentID,subID));
		System.out.println();
		displayData(isITstudent(studentID),isITsubject(subID));
	}
	public static boolean isLength(String sid,String subID) {
		if (sid.length()==10 && subID.length()==7) {
			return true;
		}
		return false;
	}
	public static boolean isITstudent(String sid) {
		if(sid.substring(0,3).equals("211")&&sid.substring(3,6).equals("311"))
			return true;
		else return false;
	}
	public static boolean isITsubject(String subID) {
		if(subID.substring(0,2).equals("21")&&subID.substring(4,5).equals("1"))
			return true;
		else return false;
	}
	public static void displayData(boolean stdIT, boolean subIT) {
		if(stdIT==true)
			System.out.print("Student id : "+studentID+" 1st year student in IT");
		else 
		System.out.print("Student id : "+studentID+" is not 1st year student in IT");
		if(subIT==true)
		System.out.print("Enroll in course for year 1");
		else 
			System.out.print("not enroll in course for year 1");

	}

	

}
