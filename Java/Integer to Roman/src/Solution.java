

import java.util.ArrayList;

/*****************
 * 
 * ͨ�������ִ����λ�����λ������ÿ����������
 * Ȼ�󽫸�λ��õ�����������ӣ�������ս��
 * @author Administrator
 *
 */

public class Solution {
	//�������飬��˳����������ַ�
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
	//��5Ϊ�ֽ��ߣ��ֱ�ͨ����λ������5�ĳ����������ֱ��ж�
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
	 * ��5��0�����
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
	 * ��5��1�����
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
