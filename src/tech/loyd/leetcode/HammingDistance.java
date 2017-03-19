package tech.loyd.leetcode;

/**
 * 
 * @author Loyd
 * 461. Hamming Distance
 */

public class HammingDistance {
	public int hammingDistance(int x, int y) {
        //Integer.bitCount，返回这个整数转换成二进制有几个1
        //按位^（异或），相同为0，不同为1
		return Integer.bitCount(x ^ y);
	}
}
