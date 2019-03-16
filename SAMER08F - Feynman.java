
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*; 
class Demo {

    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
        StringBuffer ans = new StringBuffer();
        while(true)
        {
            int t = cin.nextInt();
            if(t==0)
                break;
            ans.append(((t*(t+1)*(2*t+1))/6)+"\n");
        }        
        System.out.print(ans);
}

        
    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;
 
        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }
 
        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
 
        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
 
            return tokenizer.nextToken("\t");
        }
 
        public long nextLong() {
            return Long.parseLong(next());
        }
         
        public int nextInt() {
            return Integer.parseInt(next());
        }
 
    }
  } 