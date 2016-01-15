

import java.util.ArrayList;

/*****************
 * 
 * 通过对数字从最低位到最高位的数字每个单独处理，
 * 然后将各位获得的罗马数字相加，获得最终结果
 * @author Administrator
 *
 */

public class Solution {
	//定义数组，按顺序放入罗马字符
	String[] stringArray = {"I","V","X","L","C","D","M"};
	public String intToRoman(int num) {	
		int stringIndex = 0;
		int tempnum = 0;
		String result = "";
		do{
			tempnum = num%10;
			num = num/10;
			if(tempnum == 0){
				stringIndex +=2;
				continue;
			}
	//以5为分界线，分别通过各位数字与5的除数和余数分别判断
			else{
				if(tempnum/5 == 0 ){
					result = getString1(stringIndex,tempnum%5) + result;
				}
				else if(tempnum/5 == 1 && tempnum % 5 !=0){
					result = getString2(stringIndex,tempnum%5) + result;
				}
				else if(tempnum/5 == 1 && tempnum% 5 ==0){
					result = stringArray[stringIndex+1] + result;
				}
			}
			stringIndex += 2;
		}while(num != 0);
		return result;
	}
	
	/****************
	 * 
	 * 与5余0的情况
	 * @param stringIndex
	 * @param rest
	 * @return
	 */
	public String getString1(int stringIndex, int rest){
		String result = "";
		switch(rest){
			case 1 : 
				result = stringArray[stringIndex];
				break;
			case 2 :
				result = stringArray[stringIndex] + stringArray[stringIndex];
				break;
			case 3 :
				result = stringArray[stringIndex] + stringArray[stringIndex] + stringArray[stringIndex];
				break;
			case 4 :
				result = stringArray[stringIndex] + stringArray[stringIndex+1];
				break;
			default :
				break;		
		}
		return result;
	}
	
	/*****************
	 * 
	 * 与5余1的情况
	 * @param stringIndex
	 * @param rest
	 * @return
	 */
	public String getString2(int stringIndex, int rest){
		String result = "";
		switch(rest){
			case 1 : 
				result = stringArray[stringIndex+1] + stringArray[stringIndex];
				break;
			case 2 :
				result = stringArray[stringIndex+1] + stringArray[stringIndex] + stringArray[stringIndex];
				break;
			case 3 :
				result = stringArray[stringIndex+1] + stringArray[stringIndex] + stringArray[stringIndex] + stringArray[stringIndex];
				break;
			case 4 :
				result = stringArray[stringIndex] + stringArray[stringIndex+2];
				break;
			default :
				break;		
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2543;
		Solution s = new Solution();
		System.out.println(s.intToRoman(num));
	}

}
