import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    int line = Integer.parseInt(br.readLine());

    while(line-- > 0) {
      String vps = br.readLine();
      char[] arr = vps.toCharArray();
      int count = 0;
      boolean isVps = true;

      for(char c : arr) {
        if(c == '(') {
          count++;
        } else {
          if(count <= 0) {
            isVps = false;
          }
          count--;
        }
      }

      if(count != 0) {
        isVps = false;
      }

      if(isVps) {
        sb.append("YES\n");
      } else {
        sb.append("NO\n");
      }
    }

    bw.write(sb.toString());

    br.close();
    bw.close();
  }
}
