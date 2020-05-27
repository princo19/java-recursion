
public class RecursionBubbleSort {

	public static void main(String[] args) {
		int []array = {2,1,5,3,7,35};
		
		Bubble(array,0,array.length-1);
		display(array);

	}
	
	public static void Bubble(int []arr , int si , int li) {
		if(li==0) {
			return;
		}
		
		if(si==li) {
			Bubble(arr , 0 ,li-1);
			return;
		}
		if(arr[si]>arr[si+1]) {
			int temp = arr[si];
			arr[si]= arr [si+1];
			arr[si+1] = temp;
		}
		Bubble(arr, si+1 ,li);
	}
	
	public static void display(int [] arr) {
		for(int i =0 ; i<arr.length; i++ ) {
			System.out.println(arr[i]);
		}
	}
	
	
}
