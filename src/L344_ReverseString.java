package src;

public class L344_ReverseString {
    public void dfs(int  i  , int j  , char arr [])
    {

        if(j < i)
        {
            return  ;
        }
        char temp =  arr[i] ;
        arr[i] =  arr[j] ;
        arr[j] =  temp ;

        dfs(i+1 , j-1 , arr);
    }
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        dfs(i,j,s);
    }
}
