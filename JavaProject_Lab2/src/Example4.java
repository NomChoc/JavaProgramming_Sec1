import javax.swing.*;//input data from dialog box
import java.text.*;
public class Example4 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		String productName = JOptionPane.showInputDialog("Input Product Name : ");
		
		/*String strUnit = JOptionPane.showInputDialog("Input Product Unit : ");
		//convert string to int
		int productUnit = Integer.parseInt(strUnit);*/
		int productUnit = Integer.parseInt(JOptionPane.showInputDialog("Input Product Name : "));
		
		
		String strPrice= JOptionPane.showInputDialog("Input Price Per Unit : ");
		float pricePerUnit = Float.parseFloat(strPrice);
		float totalPrice = productUnit*pricePerUnit;
		double vat = totalPrice +(totalPrice*7/100);
		System.out.println("Add VAT 7%  is "+frm.format(vat)+" baht.");
		JOptionPane.showMessageDialog(null, "Total Price is   "
				+frm.format(totalPrice)+" baht."+"\nAdd VAT 7%  is "+frm.format(vat)+" baht.");
		
		
	}

}
