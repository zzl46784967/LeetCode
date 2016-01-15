
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        	Hashtable<Character,Integer> ht = new Hashtable<Character,Integer>();
	        int startIndex = 0;
	        int endIndex = 0;
	        int maxLength = 0;
		    for(int i = 0;i<s.length();i++){
		    	if(!ht.containsKey(s.charAt(i))){
		    		ht.put(s.charAt(i),i);
		    	}else{
		    		endIndex = i;
		    		maxLength = (endIndex - startIndex)>maxLength?(endIndex - startIndex):maxLength ;
		    		startIndex = (ht.get(s.charAt(i))+1)>startIndex?(ht.get(s.charAt(i))+1):startIndex;
		    		ht.put(s.charAt(i),i);
		    	}
		    }
	        endIndex = s.length();
	        maxLength = (endIndex - startIndex)>maxLength?(endIndex - startIndex):maxLength ;
	        return maxLength;
    }