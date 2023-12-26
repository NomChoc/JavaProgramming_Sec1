import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab702 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		double[] score = new double[5];
		double sum = 0,average=0;
		for(int i=0;i<score.length;i++) {
			System.out.print("Input score of student "+ (i+1)+": ");
			score[i]=scan.nextDouble();
			sum+=score[i];
			}
		System.out.println();
		
		average = sum/(score.length);
		System.out.println("Average of "+score.length+"student is "+frm.format(average));
		int j=1;
		for(double _score:score) {
			if(_score>average)
				System.out.println("> Studen "+j+" ("+frm.format(_score)+") ");
			j++;
		}
	}

}
