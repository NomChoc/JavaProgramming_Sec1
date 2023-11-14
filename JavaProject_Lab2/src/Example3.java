import java.util.*;//import from keyboard
import java.text.*;
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner input = new Scanner(System.in);
		System.out.print("Input product name   : ");
		String productName = input.nextLine();
		System.out.print("Input product unit   : ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit : ");
		float productperUnit = input.nextFloat();
		System.out.println();
		float totalPrice = productUnit * productperUnit;
		System.out.println("Total price is  "+totalPrice+" baht.");
		double vat = totalPrice +(totalPrice*7/100);
		System.out.println("Add VAT 7%  is "+frm.format(vat)+" baht.");

	}

}
