


/************
 * 
 * 可以减少一个参数
 * @author Administrator
 *
 */
public class Solution {
	public static String longestPalindrome(String s) {
		String longestPalindrome = "";
		if(s.length() == 1){
			longestPalindrome = s;
		}
		else if(s.length() == 2){
			if(s.charAt(0) == s.charAt(1)){
				longestPalindrome = s;
			}
		}
		else{
			for(int i = 1;i<s.length()-1;i++){
				int j = 0;
				int k = 0;
				j = i-1;
				k = i+1;
				longestPalindrome = judgePalindrome(i,j,s,longestPalindrome);
				longestPalindrome = judgePalindrome(k,i,s,longestPalindrome);
				longestPalindrome = judgePalindrome(k,j,s,longestPalindrome);
			}
	}
		return longestPalindrome;
	}
	
	public static String judgePalindrome(int m,int n,String s,String longestPalindrome){
		while(n>=0&&m<s.length()&&s.charAt(n) == s.charAt(m)){
			longestPalindrome = (m-n+1)>longestPalindrome.length()?s.substring(n, m+1):longestPalindrome;
			n--;
			m++;
		}
		return longestPalindrome;
	}
	
	public static void main(String args[]){
		String s = "abcbafdfsdagdfsdfabcdcba";
		System.out.println(Solution.longestPalindrome(s));
	}
}
