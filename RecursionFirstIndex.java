
public class RecursionFirstIndex {

	public static void main(String[] args) {
		int [] array = {1,2,5,6,7,6,5,7,5,5};
		System.out.println(First(array,0,5));

	}
	
	public static int First(int []arr,int si , int item) {
		if(si==arr.length) {
			return -1;
		}
		
		
		
		if(arr[si]==item) {
			return si;
		}else {
			int ans = First(arr,si+1,item);
			return ans;
		}
	}

}
