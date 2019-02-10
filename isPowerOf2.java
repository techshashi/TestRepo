class isPowerOf2
{
	public static String isPowerOf2(long num)
	{
		if (num < 0)
			return "Negative numbers not accepted";
		
		if (num ==0 || (num % 2 )!=0)
			return "Not a power of two";
		
		while (num!=1)
		{
			if ((num%2)!=0)
				return "not a power of two";
			else
				num=num/2;
		}
		return "Yes it is power of two";
	}
	public static void main(String[] args)
	{
		System.out.println(isPowerOf2.isPowerOf2(9));
	}
}

class checkIsPowerOf2
{
	public static void main(String[] args)
	{
		System.out.println(isPowerOf2.isPowerOf2(9));
	}
}

			