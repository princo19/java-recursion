import java.util.Scanner;

public class Recursion1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		scn.close();
		PI(num);

	}
	public static void PI(int n) {
		if(n==0) {
			return;
			
		}
		PI(n-1);
		System.out.println(n);
	}

}
