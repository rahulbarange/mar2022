public class p16
{
	public static void main(String args[])
	{   int a=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(a--);
			}a=5;
			System.out.println();
		}
	}
}
