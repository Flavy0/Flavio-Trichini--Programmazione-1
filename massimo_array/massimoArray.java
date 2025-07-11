package steve_jobs;

public class massimoArray {

	public static void main(String[] args) {
		int arr[] = {2, 40, 35, 100, 85, 7};
		int max = 0;
		for (int i=0; i<arr.length ; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.print(max);

	}

}
