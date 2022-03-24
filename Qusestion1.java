/*
11.String Processing - III
Write a program to read a string where all the lowercase 'x' chars have
been moved to the end of the string.
Include a class UserMainCode with a static method moveX which accepts the
string. The return type is the modified string.
Create a Class Main which would be used to accept the string and call the
static method present in UserMainCode.
Input and Output Format:
Input consists of a string.
Output consists of a string.
Refer sample output for formatting specifications.
Sample Input 1:
xxhixx
Sample Output 1:
hixxxx
Sample Input 2:
XXxxtest
Sample Output 2:
XXtestxx
*/

public class Qusestion1 {
public class UserMaincode {
	public String moveX(String s)
	{
		String s1=s.replaceAll("[x]", "");
		String s2=s.replaceAll("[^x]","");
		s1=s2;
		return s1;
		
	}
}
}
	
