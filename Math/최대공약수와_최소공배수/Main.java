import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int gcd = GCD(a, b);
		int lcm = LCM(a * b, gcd);

		sb.append(gcd).append('\n').append(lcm);

		System.out.print(sb);

	}

	public static int GCD(int a, int b) {
		if(b == 0) {
			return a;
		}

		return GCD(b, a%b);
	}

	public static int LCM(int total, int GCD) {
		return total / GCD;
	}
}