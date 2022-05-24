class Solution {
    public int longestValidParentheses(String S) {
        // int i,count=0;
        // for(i=0;i<s.length();i++){
        //     if(s.charAt(i) == '(' && s.charAt(i+1) == ')'){
        //         count+= 2;
        //         if(s.charAt(i+2)=='('){
        //             break;
        //         }
        //     }
        // }
        // return count;
        int open=0;
        int close=0;
        int len=0;
        int max=0;

    for(int i=0;i<S.length();i++)
    {
        char ch=S.charAt(i);
        if(ch=='(')
        {
            open++;
        }
        else
        close++;
        
        if(open==close)
        {
            len=open+close;
            max=Math.max(max,len);
        }
        if(close>open)
        {
            open=close=0;
        }
    }
    
    open=close=0;
    for(int i=S.length()-1;i>=0;i--)
    {
        char ch=S.charAt(i);
        if(ch=='(')
        {
            open++;
        }
        else
        close++;
        
        if(open==close)
        {
            len=open+close;
            max=Math.max(max,len);
        }
        if(open>close)
        {
            open=close=0;
        }
    }
    return max;
    }
}
