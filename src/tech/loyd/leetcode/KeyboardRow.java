package tech.loyd.leetcode;

import java.util.ArrayList;

/**
 * 
 * @author Loyd
 * 500. Keyboard Row
 */

public class KeyboardRow {
	String[] rows = new String[] { "QWERTYUIOPqwertyuiop",
			"ASDFGHJKLasdfghjkl", "ZXCVBNMzxcvbnm" };

	public String[] findWords(String[] words) {
		ArrayList<String> result = new ArrayList<String>();

		int currentRow = 0;
		boolean found = true;
		for (String s : words) {
			currentRow = getCurrentRow(s.charAt(0));
			found = true;
			for (char c : s.toCharArray()) {
				//如果当前行上没有对应的字�?
				if (rows[currentRow].indexOf(c) == -1) {
					found = false;
					break;
				}
			}
			if (found)
				result.add(s);
		}

		return result.toArray(new String[result.size()]);
	}

	//获取当前的字符在第几�?
	private int getCurrentRow(char c) {
		for (int rowNumber = 0; rowNumber < 3; rowNumber++) {
			if (rows[rowNumber].indexOf(c) != -1) {
				return rowNumber;
			}
		}
		return -1;
	}
}
