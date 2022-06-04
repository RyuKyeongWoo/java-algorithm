package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursive0702 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        recursive(n);
    }

    public static void recursive(int n){
        if(n == 0){
            return;
        }
        recursive(n/2);
        System.out.print(n%2);
    }
}
