import java.util.StringTokenizer;

class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        
        String str="";
        StringTokenizer st=new StringTokenizer(s);
        while(st.hasMoreTokens())
        {
             str=st.nextToken();
        }
        int res=str.length();
        return res;
    }
}