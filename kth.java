//How to find kth largest element in an unsorted array?

import java.util.*;
public class kth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int n=sc.nextInt();
        
        int [] arr= new int[n];
        System.out.print("Enter the array elements:");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value of k:");
        int k=sc.nextInt();

        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
System.out.print("kth element:"+arr[k-1]);
    }

}