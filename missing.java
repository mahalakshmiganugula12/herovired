import java.util.*;
class missing{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,sum=0,arr[];
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int i=0;
        int a=arr[n-1];
        for(int j=1;j<=a;j++){
            if(arr[i]!=j){
              System.out.print(j+" ");
            }
            else 
             i++;
        }

    }
}
