// A program to find the number of zeros //
package Functions;


import java.io.*;
import java.util.*;

class GFG {
	static int firstzeroindex(int arr[], int n)
	{
    int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				cnt++;
        if(cnt <= 0){
          System.out.println("0");
        }
        else{
          System.out.println(cnt);
        }
			}
      else{
        return 0;
      }
		}
		return -1;
	}
	public static void main(String[] args)
	{
    int s;
    Scanner sc = new Scanner(System.in);
    s = sc.nextInt();
		int arr[] = new int[s];
		int n = arr.length;
    firstzeroindex(arr, n);
		// int x = firstzeroindex(arr, n);
		// if (x == -1) {
		// 	System.out.println("Count of zero is 0");
		// }
		// else {
		// 	System.out.print("count of zero is ");
		// 	System.out.println(n-x);
		// }
	}
}

// This code is contributed by Abhijeet Kumar(abhijeet19403)
