import javax.swing.*;
public class shop100Baht {
	public static void main(String[] args) {
		product sold = new product();
		int buttonConirm=JOptionPane.showConfirmDialog(null, "Pattanakarn?");
		if(buttonConirm==0) {
			sold= new PattanakarnBranch();
		}
		int numofProduct = Integer.parseInt(JOptionPane.showInputDialog("Input the number of product"));
		sold.setUnit(numofProduct);
		JOptionPane.showMessageDialog(null, sold.toString());
		
	}
	
	
}
