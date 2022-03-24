import java.util.StringTokenizer;
public class UserMaincode2 {

		public static String printCapitalized(String s) {
			String str;
			StringBuffer sb = new StringBuffer();
			StringTokenizer t = new StringTokenizer(s);
			while (t.hasMoreTokens()) {
				String s2 = t.nextToken();
				String s3 = s2.substring(0, 1);
				String s4 = s2.substring(1, s2.length());
				sb.append(s3.toUpperCase()).append(s4).append(" ");
			}
			str = sb.toString();
			return str;

		}
	}


