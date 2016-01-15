

public class Solution {
	public static int myAtoi(String str){
		char[] ch = str.toCharArray();
		long sum = 0;
		int flag = 1;
		int start = 0;
		int carry = 0;
		for(int i = 0;i<ch.length;i++){
			if(ch[i] == '-'){
				flag = -1;
				start = i+1;
				break;
			}
			else if(ch[i] == '+'){
				flag = 1;
				start = i+1;
				break;
			}
			else if(ch[i]>='0'&&ch[i]<='9'){
				start = i;
				break;
			}
			else if(ch[i] ==' '){
				continue;
			}else{
				start = i;
				break;
			}
		}
		for(int i = start;i<ch.length;i++){
			if(ch[i]>='0'&&ch[i]<='9'){
				sum = sum*10 + ((int)ch[i]-48);
				if(sum*flag>Integer.MAX_VALUE){
					sum = Integer.MAX_VALUE;
					carry = 1;
					break;
				}
				if(sum*flag<Integer.MIN_VALUE){
					sum = Integer.MIN_VALUE;
					carry = 1;
					break;
				}
			}
			else {
				break;
			}
		}
		sum = carry == 1?sum:sum*flag;
		return (int)sum;
	}
	
	public static void main(String args[]){
		String str = " 8552307";
		System.out.println(Solution.myAtoi(str));
	}
}
