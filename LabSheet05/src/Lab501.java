import java.util.Scanner;

public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String name = scan.nextLine();
		int space = name.trim().indexOf(" ");
		if(space==-1) 
			System.out.print("Incorrect Name ");
		else {
			System.out.println("First name : "+(name.substring(0,space)).toUpperCase());
			System.out.println("Last  name :"+name.substring(space));
		}
	}

}
