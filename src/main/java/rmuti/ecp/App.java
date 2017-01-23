package rmuti.ecp;

public class App 
{

	public static void main(String[] args) 
	{

		ArrayOperation test = new ArrayOperation();
		System.out.println("In Array = " + test);
		System.out.println("Sum of Array : " + test.sumArrays());
		System.out.println("Max of Array : " + test.maxArrays());

		int num[] = test.copyArray(0, 5);

		for (int i = 0; i < num.length; i++) 
		{
			if (num[i] != 0) 
			{
				System.out.println(num[i] + " ");
			}
		}
	}
}