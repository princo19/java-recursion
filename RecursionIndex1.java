
public class RecursionIndex1 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 5, 5, 56, 8, 8, 5, 5, 8, 8 };
		int[] ans = Index(array, 5, 0, 0);
		display(ans);

	}

	public static int[] Index(int[] arr, int item, int count, int si) {
		if (si == arr.length) {
			int[] base = new int[count];
			return base;
		}

		int[] indices = null;

		if (arr[si] == item) {
			indices = Index(arr, item, count + 1, si + 1);

		} else {
			indices = Index(arr, item, count, si + 1);

		}
		if (arr[si] == item) {
			indices[count] = si;

		}
		return indices;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
