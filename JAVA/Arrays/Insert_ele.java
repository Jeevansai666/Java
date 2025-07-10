import java.util.Scanner;
class Insert_ele{
	public static void main(String[] args){
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter  the Position : ");
		int pos = s.nextInt();
		System.out.println("Enter  the Element : ");
		int ele = s.nextInt();
		a[pos]=ele;
		for(int i = 0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
