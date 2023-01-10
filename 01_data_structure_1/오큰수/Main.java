import java.util.Stack;
import java.util.StringTokenizer;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    Stack<Integer> stack = new Stack<>();

    int size = Integer.parseInt(br.readLine());
    int[] arr = new int[size];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0; i<size; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    for(int i=0; i<size; i++) {
      while(!stack.empty() && arr[stack.peek()] < arr[i]) {
        arr[stack.pop()] = arr[i];
      }

      stack.push(i);
    }

    while(!stack.empty()) {
      arr[stack.pop()] = -1;
    }

    for(int i : arr) {
      sb.append(i).append(' ');
    }

    bw.write(sb.toString());
    bw.close();
    br.close();
	}
}
