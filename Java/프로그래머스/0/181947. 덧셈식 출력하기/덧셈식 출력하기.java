import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] li = br.readLine().split(" ");
        int[] intli = new int[li.length];
        for(int i=0 ; i<li.length ; i++){
            intli[i] = Integer.parseInt(li[i]);
        }        
        int sum = intli[0] + intli[1];
        System.out.print(intli[0] + " + " + intli[1] + " = " + sum);
    }
}