
public class RecursionLastIndex {

	public static void main(String[] args) {
		int []array = {1,2,3,4,5,6,5,6,4,4,8};
		System.out.println(LAST(array,0,4));

	}

	
	public static int LAST(int []arr, int si , int item) {
		if(si==arr.length) {
			return -1 ;
		}
		int index = LAST(arr , si+1 ,item);
		if(index ==-1) {
			if(arr[si]==item) {
				return si;
			}else {
				return -1;
			}
		}else {
			return index;
		}
	}
	
	
}
