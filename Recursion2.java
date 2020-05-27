import java.util.Scanner;

public class Recursion2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		scn.close();
		PDI(num);

	}

	public static void PDI(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PDI(n-1);
		System.out.println(n);
		
	}

}
