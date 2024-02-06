import java.io.*;
import java.util.*;
public class Example1202 {

	public static void main(String[] args)throws IOException {
		Scanner input = new Scanner (System.in);
		System.out.print("Input Section: "); 

		int section = input.nextInt();
		Header(section);
		showListStudent(section);
	}

	public static void showListStudent(int sectionInput)throws IOException {
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//List107.txt"));
		String tmp ="";
		while((tmp=readFile.readLine())!=null) {
			String[] data = tmp.split("\t");
			double midscore = Double.parseDouble(data[4]);
			double finalscore = Double.parseDouble(data[5]);
			int sectionFile =Integer.parseInt(data[3]);
			if(sectionFile==sectionInput)
				System.out.println(data[0]+"\t"+data[2]+"\t"+midscore+"\t"+finalscore+findResult(midscore,finalscore));
		}
		readFile.close();
	}
	public static String findResult(double midscore ,double finalscore) {
		double totalScore=midscore+finalscore;
		if(totalScore<=40)return "Fail";
		else return "Pass";//return totalScore<=40?"Fail":"Pass";
		
	}
	public static void Header(int sec) {
		System.out.println("********************************************");
		System.out.println("\tList of Data for Section "+sec);
		System.out.println("********************************************");

	}
	
	
}
