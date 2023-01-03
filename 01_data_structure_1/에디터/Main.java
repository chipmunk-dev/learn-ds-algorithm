import java.util.Stack;
import java.util.StringTokenizer;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    Stack<Character> left = new Stack<>();
    Stack<Character> right = new Stack<>();

    String baseInput = br.readLine();

    for(int i=0; i<baseInput.length(); i++) {
      left.push(baseInput.charAt(i));
    }

    int line = Integer.parseInt(br.readLine());

    while(0 < line--) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String command = st.nextToken();

      if(command.equals("L") && !left.empty()) {
        right.push(left.pop());
      } else if(command.equals("D") && !right.empty()) {
        left.push(right.pop());
      } else if(command.equals("B") && !left.empty()) {
        left.pop();
      } else if(command.equals("P")) {
        char input = st.nextToken().charAt(0);
        left.push(input);
      }
    }

    for(char c: left) {
      sb.append(c);
    }

    while(!right.empty()) {
      sb.append(right.pop());
    }

    bw.write(sb.toString());

    br.close();
    bw.close();
  }
}
