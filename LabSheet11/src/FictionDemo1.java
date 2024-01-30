import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input title : ");
		String title = scan.nextLine();
		
		System.out.print("Input Year : ");
		int year = Integer.parseInt(scan.nextLine());
		FictionBook fb1 =new FictionBook(title,year);
		
		System.out.print("input Name : ");
		String name = scan.nextLine();
		fb1.setAuthorName(name);
		while(!fb1.checkFormatName()) {
			System.out.print("again, input Name : ");
			name = scan.nextLine();
			fb1.setAuthorName(name);
		}
		System.out.print("input email : ");
		String email = scan.nextLine();
		fb1.setEmail(email);
		while(!fb1.checkEmail()) {
			System.out.print("again, input email : ");
			email = scan.nextLine();
			fb1.setEmail(email);
		}
		System.out.println(fb1);
	}

}
