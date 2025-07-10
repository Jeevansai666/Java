import java.util.Scanner;
class Find_element{
	public static void main(String[] args){
		int a[] = {1,2,3,4,5};
		int sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Search element : ");
		int se = s.nextInt();
		int temp = 0;
		int pos = 0;
		for(int i=0;i<a.length;i++)
		{
			if(se==a[i]){
			temp = 1;
			pos = i;
			}
		}
			 if(temp == 1)
			 {
				System.out.println("Element found at Pos : "+pos);
			 }
			 else{
				System.out.println("Element Not found.");
			 }
	}
}
