import java.util.Scanner;

public class RecursionFIB {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		scn.close();
		System.out.println(fib(num));

	}
	
	public static int fib(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		if(n==0) {
			return n;
		}
		
		
		
		int fnm1 = fib(n-1);
		int fnm2 = fib(n-2);
		int fn = fnm2 + fnm1 ;
		return fn;
	}

}
