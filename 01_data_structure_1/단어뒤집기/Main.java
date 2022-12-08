import java.io.*;
import java.util.Stack;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    Stack<Character> stack = new Stack<>();
    int line = Integer.parseInt(br.readLine());

    while(line-- > 0) {
      String sentence = br.readLine();

      for(int i=0; i<sentence.length(); i++) {
          if(sentence.charAt(i) == ' ') {
            while(!stack.empty()) {
              sb.append(stack.pop());
            }
            sb.append(" ");
          } else {
            stack.push(sentence.charAt(i));
          }
      }

      while(!stack.empty()) {
        sb.append(stack.pop());
      }

      sb.append('\n');
    }

    bw.write(sb.toString());
    bw.close();
    br.close();
  }

}
