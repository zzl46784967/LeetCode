
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*********
 * 
 * 用与3Sum相似的方法进行寻找。然后通过min作为当前三个数相加与目标数的差值，通过比较获得最小差值，然后得到result
 * @author Administrator
 *
 */
public class Solution {
	public static int threeSumClosest(int[] nums, int target) {
		int result = nums[1] + nums[2] + nums[nums.length - 1];
		boolean stop = false;
		int min = Math.abs(target - (nums[1] + nums[2] + nums[nums.length - 1]));
		// 防止数组内数字小于3，报错
		if(nums.length < 3){
			return result = 0;
		}else{
			Arrays.sort(nums);
			int flag = nums[0];
			for(int i = 0;i < nums.length;i++){
				//防止重复的数字做冗余的操作
				if(i>0 && nums[i] == flag) continue;
				else{
					flag = nums[i];
					int targetTemp = target - nums[i];
					int j = i+1 , k = nums.length - 1;		
					while(j < k){
						if(nums[j] + nums[k] == targetTemp){
							result = target;
							stop = true;
							break;
						}
						else if(nums[j] + nums[k] < targetTemp){
							if(Math.abs(targetTemp - (nums[j] + nums[k])) <= min){
								min = Math.abs(targetTemp - (nums[j] + nums[k]));
								result = nums[i] + nums[j] + nums[k];
							}
							j++;
						}
						else if(nums[j] + nums[k] > targetTemp){
							if(Math.abs(targetTemp - (nums[j] + nums[k])) <= min){
								min = Math.abs(targetTemp - (nums[j] + nums[k]));
								result = nums[i] + nums[j] + nums[k];
							}
							k--;
						}
					}
				}
				
				if(stop) break;
			}
			return result;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-10,0,-2,3,-8,1,-10,8,-8,6,-7,0,-7,2,2,-5,-8,1,-4,6};
		System.out.println(Solution.threeSumClosest(nums , 18));
	}

}
