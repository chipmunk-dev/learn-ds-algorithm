import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());

		final int A = Integer.parseInt(st.nextToken());
		final int B = Integer.parseInt(st.nextToken());
		final int C = Integer.parseInt(st.nextToken());

		sb.append((A + B) % C)
			.append('\n')
			.append(((A%C) + (B%C)) %C)
			.append('\n')
			.append((A * B) % C)
			.append('\n')
			.append(((A % C) * (B % C)) % C);

		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}