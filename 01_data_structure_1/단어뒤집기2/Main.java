import java.io.*;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Stack<Character> stack = new Stack<>();
    StringBuilder sb = new StringBuilder();
    boolean isTag = false;

    String input = br.readLine();
    char[] carr = input.toCharArray();

    for(char c : carr) {
      if(c == '<') {
        isTag = true;

        while(!stack.empty()) {
          sb.append(stack.pop());
        }
      } else if (c == '>') {
        isTag = false;
        sb.append(c);
        continue;
      } else if (c == ' ' && !isTag) {
        while(!stack.empty()) {
          sb.append(stack.pop());
        }
        sb.append(' ');
        continue;
      }

      if(isTag) {
        sb.append(c);
      } else {
        stack.push(c);
      }
    }

    while(!stack.empty()) {
      sb.append(stack.pop());
    }

    bw.write(sb.toString());
    bw.close();
    br.close();
  }
}
