import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        String[] splited = line.split(" ");
        
        System.out.println("a = " + splited[0]);
        System.out.println("b = "+ splited[1]);
  
    }
}