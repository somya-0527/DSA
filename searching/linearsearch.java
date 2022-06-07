package searching;

import java.util.Arrays;

import javax.lang.model.util.ElementScanner14;

public class linearsearch{
     
    public static int lsearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                //check for element in every index
                return i;
            }
        }
        return -1;
    }
    public static boolean searchstring(String str,char target) {
        if(str.length()==0){
            return false;
        }
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)==target){
        //         System.out.println(i+1);
        //         return true;
        //     }
        // }
        for(char ch:str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        
        return false;
    }
    public static int searchinrange(int[] arr,int s,int e,int target){
        if(arr.length==0){
            return -1;
        }

        for(int i=s;i<e;i++){
            if(arr[i]==target){
                //check for element in every index
                return i;
            }
        }
        return -1;

    }

    public static int findmin(int[] arr){
    int ans=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]<ans){
            ans=arr[i];}
    
    }
    return ans;
    }
//search in 2d array
   public static int[] search(int[][] arr,int target){
     
     for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr[i].length;j++){
             if(arr[i][j]==target){
                 System.out.println("i="+i+"j="+j);
                 return new int[]{i, j};
             }
         }
     }
        return new int[] {-1,-1};
    }
     
    static int findmax(int[][] arr){
        int ans=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>ans){
                    ans=arr[i][j];
                }
            }
        }
        return ans;
    }

    static boolean evencount(int n){
        int c=0;
        // if(n<0){
        //     n=n * -1;
        // }
        // if(n==0){
        //     return ;
        // }
        while(n>0){
            c++;
            n=n/10;
        }
        if(c%2==0)
        return true;
        else
        return false;
    }
    static int findnumbers(int[] arr){
        int c=0;
        for(int ele: arr){
            if(evencount(ele)){
                c++;
            }
        }
        return c;
    }

    static int maximumwealth(int[][] account){
        int max=Integer.MIN_VALUE;

        for(int[] prs: account){

            int sum=0;
            for(int ac: prs){
                sum=sum+ac;
            }
          if(max<sum){
              max=sum;
          }
        }
        return max;
    }
    public static void main(String[] args) {
      
         int[] num={3, 5,78,8000,2,48,1};
         int[][] num2={
             {1,2,3},{5,6,7},{9,0,2}
         };
        // System.out.println(lsearch(num, 8));
        // String str="helloworld";
        // System.out.println(searchstring(str,'o'));
        //   System.out.println(searchinrange(num, 2, 5, 2)); 
        //System.out.println(findmin(num));
        // int[] ans=search(num2, 9);
        //  System.out.println(Arrays.toString(ans));
        //  System.out.println(findmax(num2));
        System.out.println(findnumbers(num));
        System.out.println(maximumwealth(num2));

    } 
}