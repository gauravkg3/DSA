package Stack;

import java.util.ArrayDeque;

public class PostFix {
    public static void main(String[] args) {
    String str="100 200 + 2 / 5 * 7 +";
        System.out.println(evaluatePostfix(str));
    }
    static int evaluatePostfix(String str)
    {
        String tokens[]=str.split(" ");
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        for(String token:tokens)
        {
            if (isOpertor(token))
            {
                int second=stack.pop();
                int first=stack.pop();
                int result=0;
                
                switch(token){
                    case "+":result=first+second;
                            break;
                            
                    case "-":result=first-second;
                            break;
                    case "*":result=first*second;
                            break;
                    case "/":result=first/second;
                            break;
                    case "^":result=(int)Math.pow(first,second); 
                            break;
                            
                }
                stack.push(result);
            }
            else{
                stack.push(Integer.parseInt(token));
            }

        }
        return stack.pop();

    }
    static  boolean isOpertor(String token)
    {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("^");
    }
}
