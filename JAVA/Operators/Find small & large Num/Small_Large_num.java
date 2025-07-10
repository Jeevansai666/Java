class Small_Large_num{
	public static void main (String[] args){
		int a=30,b=20;
		if(a<b)
		{
			System.out.println("Smallest Number between "+a+" & "+b+" is : "+a);
			System.out.println("Largest Number between "+a+" & "+b+" is : "+b);
		}
		else if(a>b)
		{
			System.out.println("Smallest Number between "+a+" & "+b+" is : "+b);
			System.out.println("Largest Number between "+a+" & "+b+" is : "+a);
		}
		else
		{
		    System.out.println("Both "+a+" & "+b+" are equal . ");
		}
	}
}