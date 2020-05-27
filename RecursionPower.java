import java.util.Scanner;

public class RecursionPower {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int pow = scn.nextInt();
		scn.close();
		System.out.println(POWER(num,pow));

	}
	
	public static int POWER(int x , int n) {
		if (n==1) {
			return x;
		}
		
		int pnm1 = POWER(x,n-1);
		int pn= x*pnm1;
		return pn;
	}

}
