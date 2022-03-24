/*Playing with String - I
Given a string array and non negative integer (n) apply the following
rules.
1. Pick nth character from each String element in the String array and
form a new String.
2. If nth character not available in a particular String in the array
consider $ as the character.
3. Return the newly formed string.
Include a class UserMainCode with a static method formString which
accepts the string and integer. The return type is the string formed
based on rules.
Create a Class Main which would be used to accept the string and integer
and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a an integer which denotes the size of the array
followed by the array of strings and an integer (n).
Output consists of a string .
Refer sample output for formatting specifications.
Sample Input 1:
4
ABC
XYZ
EFG
MN
3
Sample Output 1:
CZG$*/
import java.util.Scanner;
public class Question5 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the NO.Of strings in an Aaray : ");
			int n = Integer.parseInt(in.nextLine());
			String s1[] = new String[n];

			for (int i = 0; i < n; i++) { // Intput Loop
				System.out.println("Enter String " + (i + 1) + " : ");
				s1[i] = in.nextLine();
			}
			int a = Integer.parseInt(in.nextLine());
			System.out.println("String : " + UserMaincode5.formString(s1, n, a));// Function Calling
			in.close();
		}

	}

