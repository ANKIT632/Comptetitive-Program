package EOP;
import java.util.Scanner;
import java.util.ArrayList;


public class MazeRunPath {

static void run(int row ,int col,int path[][],String s,ArrayList<String> a){
   if(row==path.length-1 && col ==path.length-1){

    a.add(s);
    
    s="";
    return ;
   }

   if(row==path.length)
   {
    return;
   }
   if(col==path.length)
   {
  return;
   }

   run(row, col+1, path, s+"R", a);
   run(row+1, col, path, s+"D", a);

   
return;

}
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("enter path length : ");
        int len=n.nextInt();
        int path[][]=new int [len][len];
        path[len-1][len-1]=1;
        ArrayList<String> aa=new ArrayList<>();
        run(0,0,path,"",aa);
        System.out.println(aa);
        n.close();
    }

}
