import java.util.Scanner;
class Difference_min_max{
	public static void main(String[] args){
		int a[] = {10,20,30,5,7,1,9,56};
		int i,j;
		Scanner s = new Scanner(System.in);
		int temp=0;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length-1;j++)
			{
			if(a[j]>a[j+1])
		{
			temp = a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
			}
		}
		System.out.println("Difference between Minimum "+a[0]+" and Maximum "+a[a.length-1]+" values is :"+(a[a.length-1]-a[0]));
	}
}
