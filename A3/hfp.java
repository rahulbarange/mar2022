public class hfp
{
	public static void main (String args[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int k=i;k<6;k++)
			{
				System.out.print(" ");
			}
			if(i==1||i==6)
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			    //System.out.print(" ");
			}
			else
			{
				for(int j=1;j<=i;j++)
				{
					if(j==1||j==i)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}System.out.println();
			}
			
		}
	}
}