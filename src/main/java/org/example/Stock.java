//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Stock {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int A[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                A[i] = Integer.parseInt(inputLine[i]);
            }
            int p = 0;
            for(int i=0; i<n-1; i++)
                p += Math.max(0,A[i+1]-A[i]);

            Solution obj = new Solution();
            ArrayList<ArrayList<Integer> > ans = obj.stockBuySell(A, n);
            if(ans.size()==0)
                System.out.print("No Profit");
            else{
                int c=0;
                for(int i=0; i<ans.size(); i++)
                    c += A[ans.get(i).get(1)]-A[ans.get(i).get(0)];

                if(c==p)
                    System.out.print(1);
                else
                    System.out.print(0);
            }System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
 class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        // code here
        ArrayList<ArrayList<Integer> > output = new ArrayList<ArrayList<Integer> >();
        int SI = 0;
        int MI= 0;
        int maxProfit = 0;
        int CI = SI + 1;
        while(CI < n){
            if(A[CI] > A[SI]){
                int profit = A[CI] - A[SI];
                if(profit >= maxProfit){
                    MI = CI;
                    maxProfit = profit;
                }
                CI +=1;
            }
            else if(A[CI] < A[SI]){
                if(maxProfit > 0){
                    ArrayList<Integer> win = new ArrayList<Integer>();
                    win.add(SI);
                    win.add(MI);
                    output.add(win);
                }
                SI = MI + 1;
                MI = SI;
                maxProfit = 0;
                CI = SI + 1;
            }

            else {
                CI +=1;
            }
        }
        if(maxProfit > 0){
            ArrayList<Integer> win = new ArrayList<Integer>();
            win.add(SI);
            win.add(MI);
            output.add(win);
        }
        return output;
    }
}
