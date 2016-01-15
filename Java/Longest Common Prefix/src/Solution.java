

/*****************
 * 
 * 题目要求找到最短的相同前缀
 * @author Administrator
 *
 */
public class Solution {

	public static String longestCommonPrefix(String[] strs) {
		if(strs.length == 0){
			return "";
		}else{
			boolean flag = true;
		    String result = "";
		     for(int i = 0;i<findMin(strs);i++){
		    	 char cha = strs[0].charAt(i);
		    	 for(int j = 0;j<strs.length;j++){
		    		 if(cha != strs[j].charAt(i)){
		    			flag = false;
		    			break;
		    		 }
		    	 }
		    	 if(flag) result += cha;
		    	 else break;
		     }
		     return result;
		}
	}
/********
 * 
 * 找到strs字符串组中最短字符串的长度	
 * @param strs
 * @return
 */
	public static int findMin(String[] strs){
		int min = strs[0].length();
		for(int i = 1;i<strs.length;i++){
			min = Math.min(min,strs[i].length());
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"abc","abd","abe"};
		System.out.println(Solution.longestCommonPrefix(strs));
	}

}
