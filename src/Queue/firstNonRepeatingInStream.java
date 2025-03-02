package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class firstNonRepeatingInStream {
    public static void main(String[] args) {

        System.out.println(firstNonRepeatingInStreams("abacbdcda"));
    }
    public  static String firstNonRepeatingInStreams(String s)
    {
        StringBuilder sb=new StringBuilder();
        int frequency []=new int[26];
        Queue<Character> q=new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c= s.charAt(i);
            q.offer(c);
            frequency[c-'a']++;  //'a'-'a'=0,'b'-'a'=1

            while(!q.isEmpty() && frequency[q.peek()-'a']>1)
            {
                q.poll();
            }
            if(q.isEmpty())
            {
                sb.append('#');
            }
            else{
                sb.append(q.peek());
            }
        }
    return sb.toString();
    }
}
