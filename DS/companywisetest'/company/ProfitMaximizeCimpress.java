package company;

import java.io.*;
//Cimpress Hackerearth
public class ProfitMaximizeCimpress{
    public static void main(String args[]) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw=new PrintWriter(System.out);
    int n=Integer.parseInt(br.readLine().trim());
    String[] ar=br.readLine().split(" ");
    int[] p=new int[n];

    for(int i=0;i<ar.length;i++){
        p[i]=Integer.parseInt(ar[i]);
    }
   int x=solveProfit(p);
   System.out.println(x);
   pw.write(x);
   br.close();
   pw.close();
    }
    
public static int solveProfit(int[] p){
    int[]  a=new int[p.length+1];
    a[0]=0;
    int res=0;
    for(int i=1;i<=p.length;i++){
         int val=p[i-1];
         int j=i-2;
         int maxdp=0;
         for(; j>=0;j--){
              if(val%p[j]==0)
              maxdp=Math.max(maxdp,a[j+1]);
         }
         a[i]=maxdp+p[i-1];
         res=Math.max(res,a[i]);

         }
        return res; 
    }


}