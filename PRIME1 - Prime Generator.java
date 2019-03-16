import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*;
 
class Demo {
 
    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
        int t = cin.nextInt();
        StringBuffer str = new StringBuffer();
        while(t-->0)
        {
        int m = cin.nextInt();
        int n = cin.nextInt();
        boolean check = true;
        for(int i=m;i<=n;i++)
        {
            check = true;
            if(i==1)
                continue;
            if(i==2)
            {
                str.append(i+"\n");
                continue;
            }
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    check = false;
                    break;
                }
            }
            if(check)
            {
                str.append(i+"\n");
            }
        }
        str.append("\n");
        }
        System.out.print(str);
    
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
 
            return tokenizer.nextToken("\n");
        }
 
        public long nextLong() {
            return Long.parseLong(next());
        }
         
        public int nextInt() {
            return Integer.parseInt(next());
        }
 
    }
  }
 