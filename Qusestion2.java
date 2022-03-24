/*Start Case
Write a program to read a sentence in string variable and convert the
first letter of each word to capital case. Print the final string.
Note: - Only the first letter in each word should be in capital case in
final string.
Include a class UserMainCode with a static method printCapitalized which
accepts a string. The return type (String) should return the capitalized
string.
Create a Class Main which would be used to accept a string and call the
static method present in UserMainCode.
Input and Output Format:
Input consists of a strings.
Output consists of a String (capitalized string).
Refer sample output for formatting specifications.
Sample Input:
Now is the time to act!
Sample Output:
Now Is The Time To Act!
*/
import java.util.Scanner;
public class Qusestion2 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Line :");
			String s = sc.nextLine();
			System.out.println("Upper Case of Starting letter of a given Line : " + UserMaincode2.printCapitalized(s));
			sc.close();
		}

	}


