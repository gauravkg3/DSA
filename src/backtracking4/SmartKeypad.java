package backtracking4;

import java.util.ArrayList;

public class SmartKeypad {
    public static void main(String[] args) {
        String input="23";
        ArrayList<String> ans=new ArrayList<>();
        ans=smartKeypad(input);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }

    }
    static ArrayList<String> smartKeypad(String input)
    {
        String[] map ={
                 ""
                ,"",
                "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> ans =new ArrayList<>();
        smartKeypadHelper(input,map, ans,"",0);
        return ans;
    }
    static void smartKeypadHelper(String input,String map[],ArrayList<String> ans,String curr,int index)
    {
        if(index==input.length())
        {
            ans.add(curr);
            return;
        }
        int keypadNumber=input.charAt(index)-'0';
        String keypadWord=map[keypadNumber];
        for (int i = 0; i <keypadWord.length(); i++) {
           //smartKeypadHelper(input, map, ans, curr+keypadWord.charAt(i), index+1);
            curr=curr+keypadWord.charAt(i);
            smartKeypadHelper(input, map, ans, curr, index+1);
            curr=curr.substring(0,curr.length()-1);
        }
    }
}
