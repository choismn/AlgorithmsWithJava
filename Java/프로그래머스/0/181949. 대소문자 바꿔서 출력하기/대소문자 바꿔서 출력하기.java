import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] splited = br.readLine().toCharArray();
        for(char c : splited){
            if(Character.isLowerCase(c)){
                System.out.print(Character.toUpperCase(c));
            }
            else{
                System.out.print(Character.toLowerCase(c));
            }
        }
    }
}