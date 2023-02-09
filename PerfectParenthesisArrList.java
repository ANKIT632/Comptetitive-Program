package EOP;

import java.util.ArrayList;

public class PerfectParenthesisArrList {

    public static void main(String[] args) {
        
        int n=3;
        ArrayList<String> list=new ArrayList<>();

        System.out.print(find(n,0,0,"",list));
        
    }

    static ArrayList<String> find (int num,int open ,int close,String s ,ArrayList<String> str){
        if(s.length()==2*num)
        {
            str.add(s);
            return str;
        }

        if(open<num)
        {
          find(num, open+1, close, s+"(",str);
        }

         if(close<open)
         {
          find(num, open, close+1, s+")",str);

         }


         return str;
    }


}
