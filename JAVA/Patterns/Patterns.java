import java.util.Scanner;
class Patterns{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int	n = s.nextInt();
		//1
/**		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	**/
	//2
		/**for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}**/
	//3
		/**for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}**/
	
	//4
	/**int a=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				a++;
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}**/
	
	
	//5
		/**int a=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(a==9){
					a=0;
				}
				a++;
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}**/
	
	//6
	/**int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				
				System.out.print(a+" ");
				a=a+2;
			}
			System.out.println();
		}
	}**/
	
	//7
		/**for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((j%2)==0)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}**/
	//8
		/**for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}**/
	//9
	/**int a=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=(i*2-1);j++)
			{
				j++;
				System.out.print(" "+j);
				
			}
			System.out.println();
		}
	}**/
	//10
		/**System.out.println("Enter String : ");
		String	str = s.nextLine();
		int n = str.length();
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(str.charAt(i-1));
			}
			System.out.println();
		}**/
	//11

		/**for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(i*2-1);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}**/
	//12
		/**for(int i=1;i<=n*2;i++)
		{
			if(i<=n)
			{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(i*2-1);j++)
			{
				System.out.print("*");
			}
			System.out.println();
			}
			else if(i>n)
			{
				int a = i-n;
			for(int j=1;j<=a;j++)
			{
				System.out.print(" ");
			}
			for(int j=(2*n-a*2-2);j>=0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			}
			
			
		}**/
		
	//13
		/**int mid = n / 2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((j==mid-i+2)||(j==mid+i)||(i==(n-(j-mid-1)))||(i==mid+j))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}**/
	//14
		/**for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||j==1||j==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}**/
		
	//15
		/**int mid = (n / 2)+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==mid||j==mid)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}**/
		
	//16
		/**int mid = (n / 2)+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j||j==n-i+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}**/
		
	//17
		/**int mid = (n / 2)+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==1||i==n||j==n||i==mid||j==mid)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}**/
		
		
	//18
		/**for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==1||j==n-i+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}**/
		
	//19
		/**for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{

				if(i==j)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}**/
		
		
	//20
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{

				if(j==1||(i==1)||(j==i))
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
