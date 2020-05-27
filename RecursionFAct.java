import java.util.Scanner;

public class RecursionFAct {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		scn.close();
		System.out.println("Factorial of " + num + " is:" + FACT(num));
		

	}
	public static int FACT(int n) {
		if(n==1) {
			return 1;
		}
		
		
		
		int fnm1=FACT(n-1);
		int fn= n * fnm1;
		return fn;
	}

}
