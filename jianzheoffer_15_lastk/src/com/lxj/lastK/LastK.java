package com.lxj.lastK;
/**
 * ����һ����������������е�����k����㡣
 * ˼·����������ָ�룬һ�����ܣ�ע��³����
 * @author linxj
 *
 */
public class LastK {
	
	public class ListNode{
		 int val;
		    ListNode next = null;

		    ListNode(int val) {
		        this.val = val;
		    }
	}
	 public ListNode FindKthToTail(ListNode head,int k) {
		 ListNode node1 = head;
		 ListNode node2 = head;
		 if(head == null||k==0){
			 return null;
		 }
		 int i = 0;
		 while(i < k){
			 if(node1 != null)
			 node1 = node1.next;
			 else{
				 return null;
			 }
			 i++;
		 }
		 while(node1 != null){
			 node1 = node1.next;
			 node2 = node2.next;
			
		 }
		 return node2;
	    }
}
