import java.util.Scanner;

public class Lab603 {
	static Scanner input = new Scanner(System.in);
	static String fname , mname,lname;
	static int space;
	public static void main(String[] args) {
		System.out.print("Please enter your name, separated by a space. ");
		String funame = input.nextLine();
		space = funame.trim().indexOf(" ");
		fname= funame.substring(0,space);
		System.out.print(fname);
		abbreviatName(funame)
	}
	public static String abbreviatName(String fullname) {
		
	}

}
