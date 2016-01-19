

import java.util.ArrayList;
import java.util.List;

/*******
 * 
 * 分析出这是一个排列组合问题，用迭代的方法实现
 * @author Administrator
 *
 */

public class Solution {
	public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        String[] list = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String temp = "";
        
       //注意如果给的digits是空则直接返回result
        if(digits.length() == 0){
        	return result;
        }else{
	        func(digits,list,digits.length(),result,temp);
	        return result;
        }
    }
	
	public static void func(String digits,String[] list,int num,List<String> result,String temp){
		if(num == 0){
			result.add(temp);
		}else{
			
			//如果遇到数字1，则不操作对后面一个字符进行操作(0也同样，但0没放入考虑)
			while(num > 0 && digits.charAt(digits.length() - num) == '1') num--;
			if(num > 0){
				int index = Integer.parseInt(String.valueOf(digits.charAt(digits.length() - num)));
				for(int i = 0;i<list[index-1].length();i++){
					func(digits,list,num-1,result,temp + list[index-1].charAt(i));
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digits = "1";
		Solution.letterCombinations(digits);
	}

}
