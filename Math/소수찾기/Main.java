import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        br.readLine();

        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()) {
            int input = Integer.parseInt(st.nextToken());

            if(minority(input)) {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.close();
        br.close();

    }

    public static boolean minority(int num) {
        if(num < 2) {
            return false;
        }

        for(int i=2; i*i<=num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
}