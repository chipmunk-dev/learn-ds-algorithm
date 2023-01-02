import java.io.*;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    Stack<Integer> stack = new Stack<>();
    int line = Integer.parseInt(br.readLine());
    int increadNum=1;

    while(line-- > 0) {
      int num = Integer.valueOf(br.readLine());

      if(num >= increadNum) {
        while (num >= increadNum) {
            stack.push(increadNum++);
            sb.append("+\n");
        }
      } else {
        if(stack.peek() != num) {
          bw.write("NO");
          bw.close();
          return;
        }
      }
      stack.pop();
      sb.append("-\n");
    }

    bw.write(sb.toString());
    bw.close();
    br.close();
  }
}
