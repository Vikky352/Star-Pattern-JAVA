// Java program for the above approach
import java.io.*;
import java.util.*;

class GFG {

	
	public static void KthCharacter(
		String S, int N, int K)
	{
		
		char strarray[] = S.toCharArray();
		Arrays.sort(strarray);

		
		char ch = strarray[K - 1];


		int count = 0;

		
		for (char c : strarray) {
			if (c == ch)
				count++;
		}

		// Print the count
      System.out.println(ch);
		System.out.println(count);
	}

	// Driver Code
	public static void main(String[] args)
	{
		String S = "ajflfdkjsabdevg";
		int N = S.length();
		int K = 4;

		KthCharacter(S, N, K);
	}
}
