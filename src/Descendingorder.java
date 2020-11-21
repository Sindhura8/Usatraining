import java.util.Arrays;

public class Descendingorder {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8  };
		// int[] output = new int[5];
		int i;
		System.out.println(Arrays.toString(array));
		for (int k = 0; k < array.length; k++) {
			for (i = 0; i <= array.length - 2; i++) {
				int x = array[i];
				int j = i + 1;
				int y = array[j];
				if (x <= y) {

					array[i] = y;
					array[j] = x;

				} // output[i]=array[i];
				System.out.println(Arrays.toString(array));
			}
		}

	}

}
