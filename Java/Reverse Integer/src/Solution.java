
public class Solution {
	public static int reverse(int x) {
	       long result = 0;
	       long temp = x;
	       if(temp != 0){
	    	   while(temp != 0){
	    		   result = result*10 + temp%10;
	    		   temp = temp/10;
	    	   }
	       }
	       else{
	    	   result = 0;
	       }
	       
	       if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) result = 0;
	       return (int)result;
	}
	
	public static void main(String args[]){
		int x = -1534236469;
		System.out.println(Solution.reverse(x));
	}
}
