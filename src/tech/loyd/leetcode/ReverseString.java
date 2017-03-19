package tech.loyd.leetcode;
/***
 * 
 * @author Loyd
 * 344.Reverse String
 */
public class ReverseString {
    public String reverseString(String s) {
        char[] c = s.toCharArray();
		char temp;
		for(int i=0;i<c.length/2;i++){
			temp = c[i];
			c[i] = c[c.length-1-i];
			c[c.length-1-i] = temp;
		}
		return String.valueOf(c);
    }
}
