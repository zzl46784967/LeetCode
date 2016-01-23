
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***********
 * 
 * 基本使用3个数字相加得目标数的方法，在外面再次套个循环，便可以获得4个数字，时间复杂度略大
 * @author Administrator
 *
 */

public class Solution {

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(nums.length < 4){
			return result;
		}else{
			Arrays.sort(nums);
			int flag = nums[0];
			for(int i = 0;i < nums.length-3;i++){ 
				flag = nums[i];
				for(int j = i+1;j<nums.length;j++){
					int temp = target - nums[i] - nums[j];
					int k = j+1 , l = nums.length - 1;
					boolean open = false;
					int flag1 = 0;
					int flag2 = 0;
					while(k < l){
						if(nums[l] + nums[k] == temp){
							
							//后面三个判断都是防止做冗余的操作，flag1,flag2,open防止冗余的标志符号
							if(open && flag1 == nums[k]){
								k++;
								continue;
							}
							else if(open && flag2 == nums[l]){
								l--;
								continue;
							}
							else if(open && flag2 == nums[k] && flag1 == nums[l]){
								k++;
								l--;
								continue;
							}
							else{
								List<Integer> list = new ArrayList<Integer>(); 
								list.add(nums[i]);
								list.add(nums[j]);
								list.add(nums[k]);
								list.add(nums[l]);
								//判断result中是否已经存在当前list
								if(result.contains(list)){}
								else result.add(list);
								flag1 = nums[k];
								flag2 = nums[l];
								open = true;
								k++;
								l--;
							}
						}
						else if(nums[l] + nums[k] < temp) k++;
						else if(nums[l] + nums[k] > temp) l--;
					}
				}
			}
			return result;
		}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-3,-2,-1,0,0,1,2,3};
		Solution.fourSum(nums, 0);

	}

}
