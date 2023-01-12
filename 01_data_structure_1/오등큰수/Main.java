import java.io.*;
import java.util.Stack;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    Stack<Integer> stack = new Stack<>();
    int[] store = new int[Integer.parseInt(br.readLine())];
    HashMap<Integer, Integer> count = new HashMap<>();
    StringTokenizer st = new StringTokenizer(br.readLine());

    for(int i=0; i<store.length; i++) {
      store[i] = Integer.parseInt(st.nextToken());

      if(count.containsKey(store[i])) {
        count.put(store[i], count.get(store[i]) + 1);
      } else {
        count.put(store[i], 1);
      }
    }

    for(int i=0; i<store.length; i++) {
      while(!stack.empty() &&
                count.get(store[stack.peek()]) < count.get(store[i])) {
        store[stack.pop()] = store[i];
      }
      stack.push(i);
    }

    while(!stack.empty()) {
      store[stack.pop()] = -1;
    }

    for(int i : store) {
      sb.append(String.valueOf(i)).append(' ');
    }

    bw.write(sb.toString());
    bw.close();
    br.close();
  }
}
