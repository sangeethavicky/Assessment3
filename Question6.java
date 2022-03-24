import java.util.Scanner;
public class Question6 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Line");
			String s = sc.nextLine();
			System.out.println("Enter a Word ");
			String s1 = sc.next();
			int count = UserMaincode6.countWords(s, s1);
			System.out.println("No.of words : " + count);
			sc.close();
		}
	}


