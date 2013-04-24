/* WAP in java to implement Selection Sort Algo. */
class SelectionSort
{
	public static void main(String args[])
	{
		int i;
		int arr[]={12,23,21,43,54,32};
		System.out.println("Current Values: ");
		for(i=0;i<arr.length;i++)
			System.out.print("\t"+arr[i]);
		SelectionSort se=new SelectionSort();
		se.selection(arr,arr.length);
		System.out.println("\n After Selection Sort: ");
		for(i=0;i<arr.length;i++)
			System.out.print("\t"+arr[i]);
	
	}
	void selection(int a[],int l)
	{
		for(int i=0;i<l;i++)
		{
			int indexmin = i;
			for(int j=i; j<l; j++)
			{
			if(a[indexmin]<a[j])	
			{
				indexmin = j;
			}
		}
		int temp = a[i];
		a[i] = a[indexmin];
		a[indexmin] = temp;
  }
  }
		


}