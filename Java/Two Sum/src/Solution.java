
import java.util.Hashtable;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
	       Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
	    	int[] indexes= new int[2];
	    	for(int i = 0;i<nums.length;i++){
				ht.put(nums[i],i);
			}
	    	for(int i = 0;i<nums.length;i++){
	    		if(ht.containsKey(target-nums[i]) && i != ht.get(target-nums[i])){
	    			indexes[0] = i+1;
	    			indexes[1] = ht.get(target-nums[i])+1;
	    			break;
	    		}
	    	}
	    	return indexes; 
	    }
}
