

import java.util.ArrayList;

/**************
 * 
 * 
 * ���ַ������һλ��ʼ�������ǰһ���ַ���ԭ�ַ���ͼ��ϣ����ұ�־����index�Ƶ�ǰһ���ַ���
 * ���ǰһ���ַ���ԭ�ַ�С�����ȥǰһ���ַ�����־��������
 * @author Administrator
 *
 */

public class Solution {
	
	 public static int romanToInt(String s) {
	     ArrayList<Character> list1 = new ArrayList<Character>();
	     ArrayList<Integer> list2 = new ArrayList<Integer>();
	     int index = s.length()-1;
	     int result = 0;
	     char[] a = {'I','V','X','L','C','D','M'};
	     int[] b = {1,5,10,50,100,500,1000};
	     for(int i = 0;i<a.length;i++){
	    	 list1.add(a[i]);
	     }
	     for(int i = 0;i<b.length;i++){
	    	 list2.add(b[i]);
	     }
	     result  = list2.get(list1.indexOf(s.charAt(index)));
	     for(int i = s.length()-2;i>=0;i--){
	    	 if(list1.indexOf(s.charAt(i)) >= list1.indexOf(s.charAt(index)) ){
	    		 index = i;
	    		 result += list2.get(list1.indexOf(s.charAt(i)));
	    	 }else{
	    		 result -= list2.get(list1.indexOf(s.charAt(i)));
	    	 }
	     }
	     return result;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.romanToInt("DCLXV"));
	}

}
