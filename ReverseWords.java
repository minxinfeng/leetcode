package test;

/**
 * Given an input string, reverse the string word by word.
 * For example,
 * Given s = "the sky is blue",
 * return "blue is sky the".
 * Clarification:
 * Q: What constitutes a word?
 * A: A sequence of non-space characters constitutes a word.
 * Q: Could the input string contain leading or trailing spaces?
 * A: Yes. However, your reversed string should not contain leading or trailing spaces.
 * Q: How about multiple spaces between two words?
 * A: Reduce them to a single space in the reversed string.
 *
 */
public class ReverseWords {

	public String reverseWords(String s) {
		String[] strs = s.split(" ");
		String returnString = "";
		if (strs.length != 0) {
			returnString = returnString + strs[strs.length - 1];
			for (int i = strs.length - 2; i >= 0; i--) {
				if (!strs[i].equals("")) {
					returnString = returnString + " " + strs[i] ;
				}
			}
		}
		return returnString;
	}

}
