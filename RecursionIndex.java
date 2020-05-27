
public class RecursionIndex {

	public static void main(String[] args) {
		int [] array= {1,2,3,5,5,6,7,8,8,7,7,7,7};
		 Index(array,7, 0);
		display(array);
		

	}
	
	public static void Index(int []arr,int item , int count) {
		for(int  i = 0 ; i<=arr.length ; i++) {
			if(arr[i]==item) {
				System.out.print(i+ " "); 
				count+=1;
			}
		}
	}
	
	
	public static void display(int[]arr) {
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}			
	}

}
