package sorting;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr={2,1,5,7,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void selection(int[] arr){
      
        for(int i = 0 ; i < arr.length ; i++){
            //find max item in array and swap with correct index.
            int last = arr.length - i - 1;
            int maxIndex=getMaxIndex(arr,0,last);
            swapped(arr, maxIndex, last);
        }
    
    }
     static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i=start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swapped(int[] arr, int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    
}
