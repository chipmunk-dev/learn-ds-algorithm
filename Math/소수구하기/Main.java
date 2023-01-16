import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        boolean[] check = new boolean[max+1];

        for(int i=2; i<=max; i++) {
        	if(check[i]) {
        		continue;
        	}

            for(int j=i*2; j<=max; j+=i) {
                check[j] = true;
            }

            if(i>=min && i<=max) {
            	sb.append(i).append('\n');
            }
        }

        System.out.print(sb);

    }
}