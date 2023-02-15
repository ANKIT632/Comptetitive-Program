package BPF;

public class printBarChart {
  static int findMax(int arr[]){
    int max=arr[0];
    for(int i=1;i<arr.length;i++){
       if(arr[i]>max){
        max=arr[i];
       }
    }
    return max;
  }
    static void find(int[] arr){
      
      int max=findMax(arr);
      int temp=max;
      for(int i=0;i<max;i++){
        for(int j=0;j<arr.length;j++){
           if(arr[j]-temp>=0){
            System.out.print("*"+" ");
           }
           else
           System.out.print("  ");

        }
        temp--;
        System.out.println();
        } 
      }

    

    public static void main(String[] args) {
       int arr[]={2,1,3,5,0,7};
        find(arr);
        
    }
    
}
