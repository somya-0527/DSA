package searching;

import java.util.Arrays;
import java.util.EnumSet;

import org.w3c.dom.css.CSSImportRule;

public class matrixbinarysearch {
   static int[] rowcolsearch(int[][] arr,int target){
       int r=0;
       int c= arr.length-1;

       while(r<arr.length && c >= 0){
           if(arr[r][c] == target){
               return new int[]{r,c};
           }
           if(arr[r][c] < target){
               r++;
           }
           else{c--;
        }
       }
       return new int[]{-1,-1};
   }

   static int[] binarysearch(int[][] arr,int r,int csteart,int cend,int target){
       while(csteart<cend){
           int mid=csteart+(cend-csteart)/2;
           if(arr[r][mid] == target){
               return new int[] {r,mid};
           }
           if(arr[r][mid]<target){
               csteart=mid+1;
           }else{
               cend=mid-1;
           }

       }
       return new int[]{-1,-1};
   }

    static int[] sortedsearch(int[][] matrix,int target){
        int rows=matrix.length;
        int col=matrix[0].length;
        if(rows==1){
            return binarysearch(matrix , 0,0,col-1,target);
        }
        int rstart=0;
        int rend=rows-1;
        int cmid= col/2;
        //run the loop till 2 are remaining
        while(rstart < (rend-1)){
            int mid=rstart + (rend-rstart)/2;
            if(matrix[mid][cmid] == target){
                return new int[] {mid,cmid};
            }if(matrix[mid][cmid] < target){
                rstart=mid;
            }
            else{
                rend=mid;
            }
        }
        //now we have 2 rows remainig 
        //check whether the target is in column of two rows
        if(matrix[rstart][cmid] == target) {
            return new int[] {rstart,cmid};
        }
        if(matrix[rstart+1][cmid] == target){
            return new int[] {rstart+1,cmid};
        }
        //search in 1st half
        if(target<= matrix[rstart][cmid-1]){
            return binarysearch(matrix, rstart, 0, cmid-1, target);
        }
        //search in 2nd half
        if(target>= matrix[rstart][cmid+1] && target <= matrix[rstart][col-1]){
            return binarysearch(matrix, rstart, cmid+1, col -1 , target);

        }
    
        //search in 3rd half
        if(target<= matrix[rstart+1][cmid-1]){
            return binarysearch(matrix, rstart+1, 0, cmid -1 , target);

        }
        //search in 4th half
        else{
            return binarysearch(matrix, rstart+1, cmid+1, col -1 , target);
        }
    
    
    
    
    }
    
    
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println(Arrays.toString(sortedsearch(arr, 7)));
        //System.out.println(Arrays.toString(search(arr, 37)));
    }
    
}
