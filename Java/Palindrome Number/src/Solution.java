

public class Solution {
	public static boolean isPalindrome(int x) {
		long temp = x;
		long reversenum = 0;
		boolean result = false;
		if(temp<0){
			return result = false;
		}
		else{
			while(temp != 0){
				reversenum = reversenum*10 + temp%10;
				temp = temp/10;
			}
			if(reversenum >Integer.MAX_VALUE || reversenum < Integer.MIN_VALUE )
				return result = false;
			else if((int)reversenum == x)
				return result = true;
			else
				return result = false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -1;
		System.out.println(Solution.isPalindrome(x));
	}

}
