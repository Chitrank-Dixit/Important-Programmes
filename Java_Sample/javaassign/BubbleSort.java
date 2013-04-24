/* WAP in java to implement Bubble Sort Algo. */
class BubbleSort
{
	public static void main(String args[])
	{
		int i;
		int arr[]={12,23,21,43,54,32};
		System.out.println("Current Values: ");
		for(i=0;i<arr.length;i++)
			System.out.print("\t"+arr[i]);
		BubbleSort bs=new BubbleSort();
		bs.bubble(arr,arr.length);
		System.out.println("\nAfter Sorting: ");
		for(i=0;i<arr.length;i++)
			System.out.print("\t"+arr[i]);
	
	}
	void bubble(int a[],int l)
	{
		int i,j,t=0;
		for(i=0;i<l;i++)
		{
		  for(j=1;j<(l-i);j++)
		  {
			if(a[j-1]>a[j])
			{
			  t=a[j-1];
			  a[j-1]=a[j];
			  a[j]=t;
			}
		}
		}
	}
	

}