package sorting;

import java.util.Arrays;

public class bubblesort {
   static void bubble(int[] arr){
       boolean swapped;
    for(int i=0;i<arr.length;i++){
        swapped=false;
        for(int j=1;j<arr.length-i;j++){
            if(arr[j] < arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                swapped=true;
            }
        }
        //if didnt swapped for a particular value of i
        //break
        if(!swapped){
            break;
        }
    }
   }
//    static void swap(int x,int y){
//     int temp=x;
//     x=y;
//     y=temp;
//    }
   static void display(int[] arr){
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
   }
    public static void main(String[] args) {
       int[] arr={2,1,5,7,3};
       bubble(arr);
       System.out.println(Arrays.toString(arr));
   } 
}
