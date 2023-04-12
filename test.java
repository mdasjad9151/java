// import java.util.Arrays;

public class test {
    public static int mostWordsFound(String[] sentences) {
        int n = sentences.length;
        String word;
       
        int wcount = 0;
        int max = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {

            word = sentences[i];
            while (j < word.length()) {
                if (word.charAt(j) != ' ') {
                    
                    j++;
                    continue;
                } else {
                    wcount++;
                    j++;

                }
            }
            
            j =0;
            if ((wcount+1) > max) {
                max = (wcount+1);
            }
            wcount =0;  

        }

   

        return max;

    }

    public static void main(String[] args) {
        // long a = nthFibonacci(7);
        // System.out.println(a);
        // int n = 3;
        // int a = n/2;
        // System.out.println(a);
        String[] sentences = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };

        int a = mostWordsFound(sentences);

        System.out.println(a);

    }
}
