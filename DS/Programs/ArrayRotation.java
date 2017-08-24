import java.util.*;
class ArrayRotation{
	public static void main(String args[]){
		System.out.print("Input d : ");
		Scanner sc = new Scanner(System.in);
		int d=sc.nextInt();
		System.out.print("Input Size of the Array : ");
		int size=sc.nextInt();
		int[] temp= new int[d];
		int[] arr= new int[size];
		for(int i=0;i<size;i++){
			arr[i]=i+1;
		}
		int j=0;
		if(size>d){
			for(int i=0;i<d;i++){
				temp[j]=arr[i];
				j++;
			}
			System.out.println(j);
			for(int i=d;i<size;i++){
				arr[i-d]=arr[i];
			}
			for(int i=0;i<d;i++){
				arr[j]=temp[i];
				j++;
			}			
		}
		for(int i=0;i<size;i++){
			System.out.print(arr[i]);
		}
		System.out.println("test");
		System.out.println(j);
		for(int i=0;i<d;i++){
			System.out.print(temp[i]);
		}
	}
} 
