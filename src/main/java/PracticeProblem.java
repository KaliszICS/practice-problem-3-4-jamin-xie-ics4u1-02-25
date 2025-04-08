import java.util.Arrays;
import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] recaman(int n) {
		if (n < 0) {
			return new int[]{};
		}

		int[] array = new int[n];
		ArrayList<Integer> arr = new ArrayList<Integer>();
		recGenerate(n, arr);
		for (int i = 0; i < array.length; i++) {
			array[i] = arr.get(i);
		}
		return array;
	}

	public static int recGenerate(int n, ArrayList<Integer> list) {
		if (n == 0) {
			return 0;
		}

		int temp = recGenerate(n - 1, list) - n;
		if (temp > 0 && !list.contains(temp)) {
			list.add(temp);
		} else {
			temp = temp + 2 * n;
			if (!list.contains(temp)) {
				list.add(temp);
			}
		}
		return temp;
	}
}
