import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		Book b =new Book();
		Scanner scan = new Scanner(System.in);
		System.out.print("Imput book title          : ");
		String title = scan.nextLine();
		System.out.print("Imput book price          : ");
		float price = scan.nextFloat();
		System.out.print("Imput book Publish year   : ");
		int Publishyear = scan.nextInt();
		b.setTitle(title);
		b.setPrice(price);
		b.setPublishyear(Publishyear);
		System.out.println();
		System.out.println(b);

	}

}
