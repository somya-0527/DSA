package questions;

import java.util.Arrays;
import java.util.HashMap;

public class twosum {
    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int rem=target - num;
            if(map.containsKey(rem)){
                int index = map.get(rem);
                if(i==index) continue;
                return new int[] {i,index};
            }
        }
    return new int[] {};
    }
    public static void main(String[] args) {
        int[] arr={2,7,8,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
}
