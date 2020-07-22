package company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
	 static long solve1(int[] arr) {
         long max=Arrays.stream(arr).max().getAsInt();
	     long count=0;
	     long k=1;
	     int i=0,j=arr.length-1;
     // for(i)	
	     return 0;
	     
	 }
    static long solve(int[] arr) {
         long max=Arrays.stream(arr).max().getAsInt();
         System.out.println(max);
         long count=0;
         long k=1;
         for(int i=0;i<arr.length-1;i++){
             for(int j=i+1;j<arr.length;j++)
             {
                  k=(long)arr[i]*(long)arr[j];
                 if(k<=max){
                     count++;
                    System.out.println(count +"   "+arr[i] +"  "+arr[j] + "  "+k);
                 }
                     k=1;
             }
        
        
            
         }
          return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        /*int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }*/
    	 int[] arr = {198798798,1,29898787,4,276767};
        long result = solve(arr);
        System.out.println();
        System.out.println(result);

       /* bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/
    }
}
