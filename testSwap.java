class testSwap
{
	public static void main(String[] args)
	{
		int a =10;
		int b =20;
		int c =0;
		
		System.out.println("Swapping starts using temp variable");
		c=b;
		b=a;
		a=c;
		System.out.println("Swapping ended and a ="+a+" and "+" b ="+b);
		
		System.out.println("Swapping starts using arithmetic operators");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapping ended using arithmetic operators and values are a="+a+" and b="+b);
		
		System.out.println("Swapping starts with bitwise operator");
		a=a^b;
		b=a^b;
		a=a^b;
    	System.out.println("Swapping ended using arithmetic operators and values are a="+a+" and b="+b);
	}
}