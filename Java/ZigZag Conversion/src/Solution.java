

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public static String convert(String s, int numRows) {
		List<ArrayList<Character>> list = new ArrayList<ArrayList<Character>>();
		int row = 0;
		int sIndex = 0;
		boolean down = true;
		boolean up = false;
		StringBuffer result = new StringBuffer();
		ArrayList<Character> array = new ArrayList<Character>();
		if(numRows == 1){
			return s;
		}else{
			while(sIndex<s.length()){
				if(down && row != numRows){
					array.add(s.charAt(sIndex));
					row++;
					if(row == numRows){
						list.add(array);
					}
					sIndex++;
				}
				else if(up && row != 0 ){
					int temp = 0;
					array = new ArrayList<Character>();
					while(temp != row){
						array.add(' ');
						temp++;
					}
					array.add(s.charAt(sIndex));
					temp++;
					while(temp<numRows){
						array.add(' ');
						temp++;
					}
					list.add(array);
					row--;
					sIndex++;
				}
				else if(row == numRows){
					array = new ArrayList<Character>();
					down = false;
					up = true;
					row -= 2;
				}
				else if(row == 0){
					array = new ArrayList<Character>();
					down = true;
					up = false;
				}
				
			}
			if(down && row != numRows){
				while(row<numRows){
					array.add(' ');
					row++;
				}
				list.add(array);
			}
			for(int i = 0;i<numRows;i++){
				for(int j = 0;j<list.size();j++){
					if(list.get(j).get(i) != ' '){
						result.append(list.get(j).get(i));
					}
				}
			}
			return result.toString();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "PAYPALISHIRING";
		System.out.println(Solution.convert(str,3));
	}

}
