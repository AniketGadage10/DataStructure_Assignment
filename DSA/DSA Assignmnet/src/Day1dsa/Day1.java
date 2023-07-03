package Day1dsa;

import java.util.Arrays;
import java.util.Scanner;

public class Day1 {

	public static void Rearrange(int[] arr) {
		int i = 0, j = arr.length - 2;
		System.out.println(j / 2);
		for (int k = 1; k <= (arr.length / 2); k++) {
			int temp = arr[k];
			arr[k] = arr[j];
			arr[j] = temp;
			j--;
		}
		for (int p = 0; p < arr.length; p++) {

			System.out.println(arr[p]);
		}
	}

	public static int findindex(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n)
				return i;
		}
		return -1;
	}

	public static int find3rdlargest(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length - 3];
	}

	public static int findsubarray(int[] arr) {
		int c = 0;
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > temp)
				c++;
			temp = arr[i];
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE");
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("ENTER THE ARRAY SIZE");
			arr[i] = sc.nextInt();
		}
		boolean flag = true;
		while (flag) {
			System.out.println("1: Find the index of an array element.");
			System.out.println("2:Find the third largest \r\n" + "ray of the given array.\r\n" + "");
			System.out.println("3:Find the maximum length of an increasing subar");
			System.out.println("4:Rearrange Everything");
			System.out.println("Enter The Choice");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter the no idex to find");
				System.out.println(" Index " + Day1.findindex(arr, sc.nextInt()));
				break;
			case 2:
				System.out.println(" 3rd Largest " + Day1.find3rdlargest(arr));
				break;
			case 3:
				System.out.println(" Subarry " + Day1.findsubarray(arr));
				break;
			case 4:
				System.out.println(" Subarry ");
				Day1.Rearrange(arr);
				break;
			case 8:
				flag = false;
				break;
			}
		}
	}
}
