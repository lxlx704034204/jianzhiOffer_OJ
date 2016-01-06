package com.lxj.merge;
/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * @author linxj
 *
 */
public class MergeList {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
public ListNode Merge(ListNode list1,ListNode list2) {
	if(list1 == null &&list2 == null){
		return null;
	}
	else if(list1 == null){
        	return list2;
        }else if(list2 == null){
        	return list1;
        }
        ListNode merge = null;
        //小的在前
        if(list2.val > list1.val){
        	merge = list1;
        	merge.next = Merge(list1.next,list2);
        }else if(list2.val <= list1.val){
        	merge = list2;
        	merge.next = Merge(list1,list2.next);
        }
        return merge;
    }
}
