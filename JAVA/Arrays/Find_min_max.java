import java.util.Scanner;
class Find_min_max{
	public static void main(String[] args){
		int a[] = {10,20,30,5,7,1,9,56};
		int b[] = new int[4];
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
		System.out.println("minimum value :"+a[0]+"\n Maxium value :"+a[a.length-1]);
	}
}
