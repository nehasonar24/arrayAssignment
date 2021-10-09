import java.util.*;
public class set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int[n];
        
        //int k=4;
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){              //sort
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        int a=1;
            
        for(int i=0;i<arr.length-1;i++){
                  if(arr[i]<=a){                   
                    a+=arr[i];
                }
                   else 
                   break;
                  
             
            } System.out.println(a);
}
}