package Array_Functions;

public class Firstevenandthenodd {

	public static void main(String[] args) {
		int arr[]= {12,23,14,15,64,21,45,88,90};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
			
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j]%2!=0) {
				System.out.print(arr[j]+" ");
			}
		}

	}

}
