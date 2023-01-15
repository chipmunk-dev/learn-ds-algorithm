import java.io.*;
import java.util.StringTokenizer;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		LinkedList<Integer> list = new LinkedList<>();

		int total = Integer.parseInt(st.nextToken());
		for(int i=1; i<=total; i++) {
			list.addLast(i);
		}

		int sequence = Integer.parseInt(st.nextToken());
		sb.append('<');

		while(list.size() > 0) {
			for(int i=1; i<sequence; i++) {
				list.addLast(list.pollFirst());
			}
			sb.append(list.pollFirst());

			if(list.size() > 0) {
				sb.append(", ");
			}
		}
		 
		sb.append('>');
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}