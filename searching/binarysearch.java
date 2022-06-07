package searching;

import java.lang.annotation.Target;

public class binarysearch {
    public static int binary(int[] arr,int target){
        int lo=0;
        int hi=arr.length-1;
        while(hi>=lo){
            int mid=lo+(hi-lo)/2;
            
            if(target < arr[mid]){
                hi=mid - 1;
            }
            else if(target > arr[mid]){
                lo = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    //cieling of number or number
    public static int cielingoftarget(int[] arr,int target){
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi ){
            int mid=lo+(hi-lo)/2;
            
            if(target < arr[mid]){
                hi=mid - 1;
            }
            else if(target > arr[mid]){
                lo = mid + 1;
            }else{
                return mid;
            }
        }
        return arr[lo];
    }
    public static int recursuvebinary(int[] arr,int target,int lo,int hi ){
        int mid=lo+(hi-lo)/2;
        if(target == arr[mid]){
            return mid;
        }

        if(target > arr[mid]){
        recursuvebinary(arr,target,mid+1,hi);}
        else {
        recursuvebinary(arr,target,lo,mid-1);}
        
        return -1;
    } 
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9,78};
        // System.out.println(binary(arr, 7));
        // System.out.println(recursuvebinary(arr, 7, 0, arr.length-1));
        System.out.println(cielingoftarget(arr,76));
    }
}
