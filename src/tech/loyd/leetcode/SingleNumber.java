package tech.loyd.leetcode;

/**
 * 
 * @author Administrator
 * 136.Single Number
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = nums[0];
        for(int i=1;i <nums.length;i++){
     	   result ^= nums[i];//异或
        }	
 		return result;
     }	
}
