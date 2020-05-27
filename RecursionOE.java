import java.util.Scanner;

public class RecursionOE {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		scn.close();
		OE(num);
		

	}
	public static void OE(int n) {
		if(n==0) {
			return;
		}
		if(n%2==1) {
			System.out.println(n);
		}
		OE(n-1);
		if(n%2==0) {
			System.out.println(n);
		}
	}

}
