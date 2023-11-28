import java.util.Scanner;

public class Lab401 {

	public static void main(String[] args) {
		int x,y,total;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input value of X : ");
		x = scan.nextInt();
		int sum = x;
		System.out.print("Input value of Y : ");
		y = scan.nextInt();
		while(y<x) {
			System.out.print("Input value of Y, again : ");
			y = scan.nextInt();
		}
		System.out.println();
		while(x<y) {
			x++;
			total=sum+x ;
			System.out.println(sum+" + "+x+" = "+total);
			sum=total;
		}
	}

}
