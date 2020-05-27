
public class RecursionPattern {

	public static void main(String[] args) {
		Pattern(5,1,1);
		

	}
	
	public static void Pattern(int N , int row ,int columns) {
		if(row>N) {
			return;
		}
		if(columns > row) {
			System.out.println();
			Pattern(N , row+1 , 1);
			return ; 
		}
		
		
		
		
		System.out.print("*");
		Pattern(N , row , columns+1);
	}

}
