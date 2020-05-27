
public class RecursionSorted {

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,7,2};
		System.out.println(isSorted(array,0));
		

	}

	public static boolean isSorted(int []arr, int si) {
		if(arr.length-1 == si) {
			return true;
		}
		
		if(arr[si]>arr[si+1]) {
			return false;
		}else {
			boolean rans = isSorted(arr , si+1);
			return rans;
		}
	}
}
