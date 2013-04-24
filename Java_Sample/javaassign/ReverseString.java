/* 85 WAP in java to reverse a string by word. */
import java.util.*;
public class ReverseString 
{
        public static void main(String[] args) {
        String a = "Chitrank Dixit My name";
        Stack <String> stack = new Stack <String>();
        String[] temp;
		String delimiter = " ";
		// given string will be split by the argument delimiter provided. 
		temp = a.split(delimiter);
		// push substring to stack
		for(int i =0; i < temp.length ; i++)
		{
            stack.push(temp[i]);
        }
        System.out.println("\nOriginal string: " + a);
        System.out.print("Reverse word string: ");
        while(!stack.empty()) {
            System.out.print(stack.pop());
            System.out.print(" ");
        }
        System.out.println("\n");
    }
}
