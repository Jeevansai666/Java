import java.util.Scanner;
class Missing_1_100{
	public static void main(String[] args){
		int a[] = new int[100];
		int b[] = new int[100];
		int count=0,missing_count=0;
		for(int i=1;i<=100;i++)
		{
			if(i==5||i==55||i==78||i==90||i==14)
			{
				System.out.print("");
			}
			else
			{
				a[count]=i;
				count++;
			}
		}
		System.out.print("The array is : ");
		for(int i=0;i<count;i++){
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<=count;i++){
			if(a[i]!=i+1)
			{
				b[missing_count]=i;
				missing_count++;
				break;
			}
		}
		System.out.print("\nMissng values are : ");
		for(int i=0;i<=missing_count;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}
