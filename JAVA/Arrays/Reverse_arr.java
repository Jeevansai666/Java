import java.util.Scanner;
class Reverse_arr{
	public static void main(String[] args){
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int b[] = new int[a.length];
		Scanner s = new Scanner(System.in);
		int index=0;
		System.out.print("Original Array : ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		for(int i=a.length-1;i>=0;i--)
		{
			b[index]=a[i];
			index++;
		}
		
		System.out.print("\nReversed Array : ");
		for(int i=0;i<index;i++)
		{
		System.out.print(b[i]+" ");
		}
	}
}
