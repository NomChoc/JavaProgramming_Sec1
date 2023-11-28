import java.text.DecimalFormat;
import java.util.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1;
		int sales;
		double salary;
		final int bsalary = 1000;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("Enter sales in dollars (or -1 to end): ");
			sales = scan.nextInt();
			if (sales == SENTINEL) {
                break;
			}
			salary = bsalary + sales * COMMISSION_RATE;
			System.out.println("Salary is: $" +frm.format(salary));
		 }
	}
}
