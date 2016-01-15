

/*
 * 
 * 从一个数组中找出三个数字想加为零，通过现将数组排序，然后通过一遍遍历，
 * 将每次遍历的数字和零做减法操作得到目标数字，再从后面的数字中找出两个数字与目标数相匹配
 * 
 * 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		// 防止数组内数字小于3，报错
		if(nums.length < 3){
			return result;
		}else{
			Arrays.sort(nums);
			int flag = nums[0];
			for(int i = 0;i < nums.length;i++){
				
				//防止重复的数字做冗余的操作
				if(i>0 && nums[i] == flag) continue;
				else{
					flag = nums[i];
					int target = 0 - nums[i];
					int j = i+1 , k = nums.length - 1;
					int flag1 = 0;
					int flag2 = 0;
					boolean open = false;
					while(j < k){
						if(nums[j] + nums[k] == target){
							
							//后面三个判断都是防止做冗余的操作，flag1,flag2,open防止冗余的标志符号
							if(open && flag1 == nums[j]){
								j++;
								continue;
							}
							else if(open && flag2 == nums[k]){
								k--;
								continue;
							}
							else if(open && flag2 == nums[k] && flag1 == nums[j]){
								j++;
								k--;
								continue;
							}
							else{
								List<Integer> list = new ArrayList<Integer>(); 
								list.add(nums[i]);
								list.add(nums[j]);
								list.add(nums[k]);
								result.add(list);
								flag1 = nums[j];
								flag2 = nums[k];
								open = true;
								j++;
								k--;
							}
						}
						else if(nums[j] + nums[k] < target) j++;
						else if(nums[j] + nums[k] > target) k--;
					}
				}
			}
			return result;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1};
		Solution.threeSum(nums);
	}

}
