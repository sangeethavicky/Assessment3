/*Strings Processing - Replication
Write a program to read a string and also a number N. Return the replica
of original string for n given time.
Include a class UserMainCode with a static method repeatString which
accepts the the string and the number n. The return type is the string
based on the problem statement.
Create a Class Main which would be used to accept the string and integer
and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string and integer.
Output consists of a string.
Refer sample output for formatting specifications.
Sample Input 1:
Lily
2
Sample Output 1:
LilyLily
*/
import java.util.Scanner;

public class Question4 {
	

	//Replication
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String :");
		    String s=sc.next();
		    System.out.println("Enter the NO.Of times to print a String");
		    int n=sc.nextInt();
		    String s2=UserMaincode4.repeatString(s,n);
		    System.out.println("Repilcation String : "+s2);
		    sc.close();
		}

	}


