import java.util.Scanner;
class Duplicate_values{
	public static void main(String[] args){
		int a[] = {2,3,6,2,8,2,9,9,9};
		int b[] = new int[];
		int i,j;
		Scanner s = new Scanner(System.in);
		int index=0;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					b[index]=a[i];
					index++;
				}
			}
		}
		for (i=0;i<index;i++)
		{
			System.out.println(b[i]);
		}
	}
}
