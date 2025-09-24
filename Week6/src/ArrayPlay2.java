
public class ArrayPlay2 {

	public static void main(String[] args) {
	int[] arr = {1, 2 ,3, 4, 5, 6, 7, 8, 9};
	System.out.println(printArray(arr));
	reverseArray(arr);
	System.out.println(printArray(arr));
	printArray(arr);
	arr= reverseArray2(arr);
	System.out.println(printarray(tempArr));

	}

	private static String printArray(int[] arr) {
		String str= null;
		for(int i =0; i < arr.length; i ++)
		{
			if(i < arr.length -1)str += arr[i] + ", ";
			else str += arr[i];
		
		}
		return str;
	}

	private static void reverseArray(int[] arr) {
		int len = arr.length;
		for(int i = 0;i < len/2; i++)
		{
			Swap(arr, i, len-1-i);
		}
		
	}
	private static int[] reverseArray2(int[] arr) {
		int len = arr.length;
		int[] arr2 = new int[len];
		for(int i = 0;i < len; i++)
		{
			arr2[i] = arr[len-1-i];
		}
		return arr2;
	}

	private static void Swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
		
	}
}
