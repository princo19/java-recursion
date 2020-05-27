import java.util.Scanner;

public class Recursion0 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		scn.close();
		PD(num);

	}
	 
	public static void PD(int n) {
		if(n==0) {
			return ;
		}
		
		
		System.out.println(n);
		PD(n-1);
		
		
		
	}

}
