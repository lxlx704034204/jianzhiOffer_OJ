package com.lxj.random;

public class Random {
    public RandomListNode Clone(RandomListNode pHead)
	    {
		  if(pHead == null){
			  return null;
		  }
	        copyList(pHead);
	        connectList(pHead);
	       return reConnectList(pHead);
	    }
	  //��ÿ���ڵ���ұ߸��Ʋ�����һ���ڵ�
	  public void copyList(RandomListNode pHead){
		  RandomListNode pNode = pHead;
		  while(pNode!=null){
			  RandomListNode pClone = new RandomListNode(pNode.label);
			  pClone.next = pNode.next;
			  pNode.next = pClone;
			  pNode = pClone.next;
		  }
		  
	  }
	  //���ñ����ƵĽڵ��randomָ��ԭ�ڵ�random��һ���ڵ�
	  public void connectList(RandomListNode pHead){
		  RandomListNode pNode = pHead;
		 
		  while(pNode!=null){
			  RandomListNode pClone = pNode.next;
			  if(pNode.random != null){
			 pClone.random = pNode.random.next;
			
			  }
              pNode = pClone.next;
		  }
	  }
	  //�������,��Ϊԭ����żΪ���Ƶ�����
	  public RandomListNode reConnectList(RandomListNode pHead){
		  RandomListNode pNode = pHead;
		  RandomListNode pClone = null;
		  RandomListNode pCloneHead = null;
		  if(pNode!=null){
			  pClone = pCloneHead = pNode.next;
			  pNode.next = pClone.next; 
			  pNode = pNode.next;
		  }
		 
		  while(pNode!=null){
			 pClone.next = pNode.next;
			 pClone = pClone.next;
			 pNode.next = pClone.next;
			 pNode = pNode.next;
			  }
		  return pCloneHead;
		  }
	  
	  
	  public class RandomListNode {
		    int label;
		    RandomListNode next = null;
		    RandomListNode random = null;

		    RandomListNode(int label) {
		        this.label = label;
		    }
		}
}
