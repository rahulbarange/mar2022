public class pb14
{
	public static void main (String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=2;i<=5;i++)
		{
			for(int k=i;k<5;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}