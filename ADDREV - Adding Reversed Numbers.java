
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.math.*; 
class Demo {


    public static void main(String[] args) throws Exception {
        FastScanner cin = new FastScanner(System.in);
        int t = cin.nextInt();
        StringBuffer ans = new StringBuffer();
        while(t-->0)
        {
           int num1 = cin.nextInt();
           int num2 = cin.nextInt();
           int reverse_num1 = 0;
           int reverse_num2 = 0;
           while(num1!=0)
           {
             reverse_num1 = reverse_num1*10  + num1%10;
             num1 = num1/10;
           }
           while(num2!=0)
           {
             reverse_num2 = reverse_num2*10  + num2%10;
             num2 = num2/10;
           }
           int sum = reverse_num2+reverse_num1;
           int reverse_sum = 0;
           while(sum!=0)
           {
            reverse_sum = reverse_sum*10 + sum%10;
            sum = sum/10;
           }
           ans.append(reverse_sum+"\n");
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