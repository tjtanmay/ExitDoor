/*  A[0......n], a[i,<i+1,...<k,>k+1,....>j-1,>j]  what is maximum length? */
import java.util.*;
class Bitonic{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
/* Traverse and check if the next element is greater or not. If yes increment the count*/
		int count=0,flag=0,max=0,check=0;
		for(int i=0;i<n-1;i++){
			if(arr[i]<arr[i+1] && check == 0){
				count++;
				flag=1;
			}
			else if(arr[i]>arr[i+1] && flag==1){
				count++;
				check=1;
			}
			else{
				count=0;
				flag=0;
				check=0;
			}
			if(max<count)
				max=count;
		}
	}
}
