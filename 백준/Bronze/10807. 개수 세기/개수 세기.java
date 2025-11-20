import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 10807
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] parts = br.readLine().split(" ");

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        int v = Integer.parseInt(br.readLine());

        int count = 0;
        for(int value : arr){
            if(value == v) count++;
        }

        System.out.println(count);
    }
}
