import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        if(num%2==0){
            System.out.printf("%d is even", num);
        }
        else{
            System.out.printf("%d is odd", num);
        }
       
    }
}