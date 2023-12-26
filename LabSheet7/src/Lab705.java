import javax.swing.JOptionPane;

public class Lab705 {
	static String ev=" ",odd=" ";

	public static void main(String[] args) {
		int[] num = new int [5];
		for(int i=0;i<num.length;i++) {
		num[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+" : "));
		
		}
		showEven(num);
		showOdd(num);
	}
	public static void showEven(int[] num) {
		for(int _num:num) {
        	if(_num %2==0) 
        		ev+= _num+" ";
		}
		JOptionPane.showMessageDialog(null, "List of even number : "+"\n"+ev);
	}
	public static void showOdd(int[] num) {
		for(int _num:num) {
        	if(_num %2==1) 
        		odd+= _num+" ";
		}
		JOptionPane.showMessageDialog(null, "List of even number : "+"\n"+odd);
	}
}
