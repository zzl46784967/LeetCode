

public class Solution {
	 public static int maxArea(int[] height) {
	        int i = 0;
	        int j = height.length-1;
	        int area = 0;
	        while(i != j){
	        	int currentArea = Math.min(height[i], height[j])*(j-i);
	        	if(currentArea>area){
	        		area = currentArea;
	        	}
	        	if(height[i] >= height[j]){
	        		j--;
	        	}else{
	        		i++;
	        	}
	        }
	        return area;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {4,45,6,7};
		System.out.println(Solution.maxArea(height));
	}

}
