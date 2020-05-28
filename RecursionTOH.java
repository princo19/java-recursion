
public class RecursionTOH {

	public static void main(String[] args) {
		int n =4;
		Tower(n,"src","des","hel");
		

	}
	
	
	public static void Tower(int n , String src , String des , String hel) {
		if(n==0) {
			return;
		}
		
		
		Tower(n-1,src,hel,des);
		System.out.println("Move "+n+"th disc from "+src+" to "+des);
		Tower(n-1,hel,des,src);
	}

}
