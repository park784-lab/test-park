package exam;

import java.util.Random;

public class Test3 {
	private static final int ramdom_max = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] array = new int[5];
		int[] array = makearr(5);

		printarr(array);

	}

	private static int[] makearr(int size) {
		int[] array = new int[size];
		Random ran = new Random() ;
		for (int i = 0 ; i < array.length; i++) {
			array[i] = ran.nextInt(ramdom_max);
		}

		return array;
		

	}

	private static void printarr(int[] arr) {
		for (int z = 0; z < arr.length; z++) {

			System.out.println(arr[z]);
		}
	}
}
