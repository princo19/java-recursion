import java.util.ArrayList;

public class RecursionMazePath {

	public static void main(String[] args) {
		
		System.out.println(getMaze(0, 0, 2, 2));

	}

	public static ArrayList<String> getMaze(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}
		if (cr > er || cc > ec) {
			ArrayList<String> base = new ArrayList<>();
			return base;
		}

		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rrh = getMaze(cr, cc + 1, er, ec);
		for (String rrhs : rrh) {
			mr.add("H" + rrhs);
		}

		ArrayList<String> rrv = getMaze(cr + 1, cc, er, ec);
		for (String rrvs : rrv) {
			mr.add("V" + rrvs);
		}

		return mr;
	}

}
