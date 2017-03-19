package tech.loyd.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 
 * @author Loyd
 * 496.Next Greater Element I
 */
public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        //map中存放在nums中所有元素的下一个比它大的元�?
    	Map<Integer, Integer> map = new HashMap<>();
    	//栈中存放�?暂时没找到比它大的元素的元素
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
        	//栈不空，栈顶元素比num小，出栈，并将出栈元素和num放入map�?
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            //�?有元素都入栈
            stack.push(num);
        }   
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }
}
