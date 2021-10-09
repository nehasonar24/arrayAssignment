import java.util.*;
public class array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int [] arr= new int[n];
    int [] arr1= new int[n];
    for (int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
            }
            for (int i=0;i<arr.length;i++){
                arr1[i]=sc.nextInt();
                    }

            for(int i=0;i<n;i++){
                for(int j=0;i<n;j++){
                    if(arr[i]==arr1[j]){
                        System.out.println("intersecting element is:"+arr[j]);
                    }
                }
            }
    }

}