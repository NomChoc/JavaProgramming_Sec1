
import javax.swing.JOptionPane;
public class Lab601 {

	public static void main(String[] args) {
		inputEmail();
	}
	public static void inputEmail() {
		String email = JOptionPane.showInputDialog("Input your e-mail : ").toLowerCase();
		while(email.startsWith("@")||email.startsWith(" ")) {
			email = JOptionPane.showInputDialog("Input your e-mail,again : ");
		}
		boolean validateEmail = checkEmail(email);
		if(validateEmail==true)
			JOptionPane.showMessageDialog(null, "Your e-mail is " +email );
		else 			
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or" + " gamil dot com");
	}
    public static boolean checkEmail(String email) {
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
			return true;
		}
		else return false;
	}

    
	
}
