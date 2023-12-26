import java.util.Scanner;

public class Lab703 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] number = {78,36,58,41,25,92,75};
			System.out.print("Input index of array : " );
			int imputnum =scan.nextInt();
		while ((imputnum<0)||imputnum>=number.length) {
			System.out.print("Input index of array, again : " );
			imputnum = scan.nextInt();
		}
		System.out.println();
		System.out.println("Value in current index is "+number[imputnum]);
		if(imputnum==(number.length-1)) 
			System.out.println("Sorry, "+imputnum+" is the last index in array.");
		
		else 
			System.out.println("Value in next    index is "+number[imputnum+1]);
		
	}

}
