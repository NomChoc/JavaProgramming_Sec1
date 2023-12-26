import javax.swing.JOptionPane;

public class Lab602 {

	public static void main(String[] args) {
		int inputyear = Integer.parseInt(JOptionPane.showInputDialog(""+ "Input Year"));
		while(!(checkYear(inputyear))) {
			inputyear = Integer.parseInt(JOptionPane.showInputDialog(""+ "Please input between 1000-3000,\nInput year again"));
		}
		JOptionPane.showMessageDialog(null,isLeapyear(inputyear)?
				                                                                 inputyear+"is Leap Year":
			                                                                     inputyear+"is not Leap Year");
		/*if (isLeapyear(inputyear)==true)
			JOptionPane.showMessageDialog(null, inputyear + " is Leap Year");
		else
			JOptionPane.showMessageDialog(null,inputyear + " is not Leap Year");*/
	}
	public static boolean isLeapyear(int year) {
		if((year%4==0)&&((year%100!=0)||(year%400==0)))
			return true;
		else return false;
	}
	public static boolean checkYear(int year) {
		if (year >= 1000&&year<=3000)
			return true;
		else return false;
	}

}
