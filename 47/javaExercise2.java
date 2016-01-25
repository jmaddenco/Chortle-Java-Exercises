import java.io.* ;

class TwoLargest
{
	public static void main ( String[] args )
	{
		int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};

		int largest = 0;
		int secondLargest = 0;

		for ( int index=0; index < data.length; index++)
		{
			if (data[index] > largest) {
				largest = data[index];
			} else if (data[index] > secondLargest) {
				secondLargest = data[index];
			}
		}

		System.out.println("Largest: " + largest);
		System.out.println("Second Largest: " + secondLargest);
	}

}