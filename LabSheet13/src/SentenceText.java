import java.io.*;
import java.util.*;
public class SentenceText {

	public static void main(String[] args)throws IOException {
		PrintStream writeFile =new PrintStream ((new File("d://txtFile//sentece.txt")));
		Scanner input =new Scanner(System.in);
		int i =1;
		while(true) {
			System.out.print("Sentence : ");
			String word = input.next().toUpperCase();
			if (word.equalsIgnoreCase("stop") )
				break;
			writeFile.println(i+":"+word);
			i++;
			}
		System.out.println("File is save ! !");
		writeFile.close();

	}

}
