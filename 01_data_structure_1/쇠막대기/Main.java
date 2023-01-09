import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    char[] input = br.readLine().toCharArray();

    int iron = 0;
    int divideCount = 0;
    boolean prevClose = false;

    for(char c : input) {
      if(c == '(') {
        iron++;
        prevClose = false;
      } else {
        iron--;
        if(prevClose) {
          divideCount+=1;
        } else {
          divideCount += iron;
        }
        prevClose = true;
      }
    }

    bw.write(String.valueOf(divideCount));
    bw.close();
    br.close();
  }
}
