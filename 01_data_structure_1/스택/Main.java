import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    Stack stack = new Stack();

    int line = Integer.parseInt(br.readLine());

    while(line-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String command = st.nextToken();

      if(command.equals("push")) {
        stack.push(Integer.parseInt(st.nextToken()));
      } else if (command.equals("pop")) {
        sb.append(stack.pop()).append('\n');
      } else if (command.equals("top")) {
        sb.append(stack.top()).append('\n');
      } else if (command.equals("empty")) {
        sb.append(stack.empty()).append('\n');
      } else if (command.equals("size")) {
        sb.append(stack.size()).append('\n');
      }
    }

    bw.write(sb.toString());
    br.close();
    bw.close();
  }
}

class Stack {
  int[] stack = new int[10000];
  int size = 0;

  public void push(int x) {
    stack[size++] = x;
  }

  public int pop() {
    if(size > 0) {
      return stack[--size];
    }
    return -1;
  }

  public int size() {
    return size;
  }

  public int top() {
    if(size > 0) {
      return stack[size-1];
    }
    return -1;
  }

  public int empty() {
    if (size > 0) {
      return 0;
    }
    return 1;
  }
}
