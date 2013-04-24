/* WAP in java to implement Binary Search Algo. */
import java.util.*;
class BinarySearch
{
        public static void main(String[] args)
		{
                int arr[] = new int[10];
                int searchValue = 0, index;
                System.out.println("Enter 10 numbers");
                Scanner input = new Scanner(System.in);
                for (int i=0;i<arr.length;i++) {
                        arr[i] = input.nextInt();
                }
                System.out.print("Enter a number to search for: ");
                searchValue=input.nextInt();
                index = binarySearch(arr, searchValue);
                if (index!=-1) 
				{
                        System.out.println("Found at index: " + index);
                }
				else
				{
                        System.out.println("Not Found");
                }
        }

        static int binarySearch(int[] search, int find)
		{
                int start, end, midPt;
                start = 0;
                end = search.length - 1;
                while (start<=end) {
                        midPt=(start + end)/ 2;
                        if(search[midPt]==find)
						{
                             return midPt;
                        }
						else if(search[midPt]<find)
						{
                            start = midPt + 1;
                        }
						else
						{
                            end = midPt - 1;
                        }
                }
                return -1;
        }
}