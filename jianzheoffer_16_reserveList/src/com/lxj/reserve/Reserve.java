package com.lxj.reserve;
/**
 * ����һ��������ת�����������������Ԫ�ء�
 * @author linxj
 *
 */
public class Reserve {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	public ListNode ReverseList(ListNode head) {
		//ListNode last = null;
		ListNode current = head;
		ListNode pre = null;
		if(head == null){
			return null;
		}
		while(current !=null){
			ListNode list = current.next;
			current.next = pre;
			pre = current;
			current = list; 
		}
		return pre;
    }
}
