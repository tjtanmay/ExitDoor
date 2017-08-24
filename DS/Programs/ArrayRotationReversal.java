import java.util.*;
/* Reversal Algorithm for array rotation */
/*Let AB are the two parts of the input array where A = arr[0..d-1] and B = arr[d..n-1]. The idea of the algorithm is:
Reverse A to get ArB. / Ar is reverse of A /
Reverse B to get ArBr. / Br is reverse of B /
Reverse all to get (ArBr) r = BA.

For arr[] = [1, 2, 3, 4, 5, 6, 7], d =2 and n = 7
A = [1, 2] and B = [3, 4, 5, 6, 7]
Reverse A, we get ArB = [2, 1, 3, 4, 5, 6, 7]
Reverse B, we get ArBr = [2, 1, 7, 6, 5, 4, 3]
Reverse all, we get (ArBr)r = [3, 4, 5, 6, 7, 1, 2]*/

//Time Complexity: O(n)
public class ArrayRotationReversal{
	public static void main(String args[]){
		System.out.print("Input d : ");
		Scanner sc = new Scanner(System.in);
		int d=sc.nextInt();
		System.out.print("Input Size of the Array : ");
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++){
			arr[i]=i+1;
		}
		rvereseArray(arr, 0, d-1);
       		rvereseArray(arr, d, n-1);
        	rvereseArray(arr, 0, n-1);
		printArray(arr);
		
	}
	static void printArray(int arr[]){
	        for (int i = 0; i < arr.length; i++)
            		System.out.print(arr[i] + " ");
    	}
 
	static void rvereseArray(int arr[], int start, int end){
        	int temp;
        	while (start < end){
	            temp = arr[start];
        	    arr[start] = arr[end];
        	    arr[end] = temp;
        	    start++;
        	    end--;
        	}
    	}
}