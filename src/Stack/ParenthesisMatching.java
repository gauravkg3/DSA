package Stack;

import java.util.ArrayDeque;

public class ParenthesisMatching {
    public static void main(String[] args) {
        String exp="(({})[]){]";
        System.out.println(isParenthesisMatching(exp));

    }
    static boolean isParenthesisMatching(String str)
    {
        int n=str.length();
        ArrayDeque<Character> stack=new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            char curr=str.charAt(i);
            if(curr=='(' || curr=='{' || curr=='[')
            {
                stack.push(curr);
            }
            else{
                if(stack.isEmpty()) return  false; //agar koe closing bracket aa rha hai and uske corresponding opening bracket na ho
                char opening=stack.pop();
                if((opening=='(' && curr==')') || (opening=='{' && curr=='}') || (opening=='[' && curr==']'))
                {
                    continue;
                }
                else return  false;
            }

        }
        return stack.isEmpty();
    }
}
