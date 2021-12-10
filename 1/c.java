class Boolean
{
	public static void main(String args[])
	{
		int i;
		boolean b;
		for(i=0;i<2;i++)
		{
			if(b=(i%2!=0))
			{
				//b=i%2; //it gives error because int can't convert to boolean
				System.out.println("Value Of Boolean Is "+b+" Non Zero");
			}
			else
			{
				System.out.println("Value Of Boolean Is "+b+" Zero");
			}
		}
	}
}