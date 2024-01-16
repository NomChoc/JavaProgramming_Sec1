import java.util.*;
public class AuthorDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Imput Author name          : ");
		String name = scan.nextLine();
		System.out.print("Imput Author e-mail        : ");
		String email = scan.nextLine();
		System.out.print("Imput Author gender        : ");
		char gender = scan.next().charAt(0);
		Author a = new Author( name,  email,  gender);
		System.out.println();
		System.out.println(a);
		
	}

}
