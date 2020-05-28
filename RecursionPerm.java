import java.util.ArrayList;

public class RecursionPerm {

	public static void main(String[] args) {
		System.out.println(getPER("abcd"));

	}

	public static ArrayList<String> getPER(String str) {
		if (str.length() == 0) {
			ArrayList<String> base = new ArrayList<>();
			base.add(" ");
			return base;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = getPER(ros);
		ArrayList<String> my = new ArrayList<>();
		for (String rrs : rr) {
			for (int i = 0; i < rrs.length(); i++) {
				String val = rrs.substring(0, i) + ch + rrs.substring(i);
				my.add(val);

			}
		}
		return my;
	}

}
