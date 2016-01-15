/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        int flag = 1;
        ListNode resultnode = null;
        ListNode tempresultnode = null;
        do{
        	if(l1 == null){
        		num1 = 0;
        	}else{
        		num1 = l1.val;
        	}
        	
        	if(l2 == null){
        		num2 = 0;
        	}else{
        		num2 = l2.val;
        	}
        	
        	result = num1 + num2 + carry;
        	if(result >= 10){
        		carry = 1;
        		result = result % 10;
        	}else{
        		carry = 0;
        	}
        	
        	if(flag == 0){
        		ListNode tempnode = new ListNode(result);
        		tempresultnode.next = tempnode;
        		tempresultnode = tempresultnode.next;
        	}
        /*******************
         *创建新的链表头 
         * 
         */
        	else{
        		ListNode tempnode = new ListNode(result);
            	resultnode = tempnode;
            	tempresultnode = resultnode;
            	flag = 0;
        	}
        	
        	if(l1 != null) l1 = l1.next;
        	if(l2 != null) l2 = l2.next;
        }while(l1 != null || l2 != null);
        if(carry == 1){
        	ListNode tempnode = new ListNode(1);
    		tempresultnode.next = tempnode;
    		tempresultnode = tempresultnode.next;
        }
        return resultnode;
    }
}