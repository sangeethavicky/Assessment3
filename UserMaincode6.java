import java.util.StringTokenizer;

public class UserMaincode6 {

	public static int countWords(String s, String s1) {
		int count = 0;
		String s3;
		StringTokenizer str = new StringTokenizer(s);
		while (str.hasMoreTokens()) {
			s3 = str.nextToken();
			if (s3.equals(s1))
				count++;
		}
		return count;

	}
}


