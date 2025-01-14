package recursionProblems;

public class recursionProblem2 {
    public static void main(String[] args) {
        String str="c";
        String target="a";

       System.out.println(isPalindrome(str));
        //System.out.println(countOccurences(str,target));
        //printAllSubSets(str);
    }
    static void printAllSubSets(String str)
    {
        printAllSubsetsHelper(str,0,"");
    }
    static  void printAllSubsetsHelper(String str,int i,String curr)
    {
        if(i==str.length()){
            System.out.println(curr);
            return;
            }
            printAllSubsetsHelper(str,i+1,curr+str.charAt(i));
            printAllSubsetsHelper(str,i+1,curr);
    }

    static int countOccurences(String str,String target)
    {
        return countOccurencesHelper(str,target,0);
    }
    static int countOccurencesHelper(String str ,String target,int i)
    {
        if(i>str.length()-target.length())
        {
            return 0;
        }
        int subProblemKaAnswer=countOccurencesHelper(str,target,i+1);
        if(str.substring(i,i+target.length()).equals(target))
        {
            return subProblemKaAnswer+1;
        }
        else return subProblemKaAnswer;
    }
    static  boolean isPalindrome(String str)
    {
        return isPalindromeHelper(str,0,str.length()-1);
    }
    static boolean isPalindromeHelper(String str,int l,int r) {
        if (l >= r) return true;
        if (str.charAt(l) == str.charAt(r)) {
            return isPalindromeHelper(str, l + 1, r - 1);
        }
        return false;
    }

}
