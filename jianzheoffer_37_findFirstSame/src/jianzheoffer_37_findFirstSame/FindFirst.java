package jianzheoffer_37_findFirstSame;
/**
 * �������������ҳ����ǵĵ�һ��������㡣
 * @author linxj
 *˼·һ��Ҫ��β����ʼ�ң����Կ���������ջ��
 *˼·�������ҳ�����������������ıȶ̵ĳ���n���ó�������n���ٽ��бȽϣ�ֱ���ҵ���ͬ�㡣
 */
public class FindFirst {
	public static void main(String[] args){
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		node1.next = node2;
		node3.next = node4;
		node2.next = node5;
		node4.next = node5;
		node5.next = node6;
		System.out.println(FindFirstCommonNode(node1,node3).val);
		
	}
	public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		 if(pHead1 == null || pHead2 == null){
			 return null;
		 }
		 int num1 = 0;
		 int num2 = 0;
		 int mul = 0;//����
		 ListNode pSameFirst = null;
		 ListNode pLongFirst = null;
		 ListNode pShortFirst = null;
		 ListNode pHead1First = pHead1;
		 ListNode pHead2First = pHead2;
		 while(pHead1!=null){
			 num1++;
			 pHead1 = pHead1.next;
		 }
		 while(pHead2!=null){
			 num2++;
			 pHead2 = pHead2.next;
		 }
		 if(num1 > num2){//��������������
			mul = num1 - num2; 
			pLongFirst = pHead1First;
			pShortFirst = pHead2First;
		 }else{
			 mul = num2 - num1;
			 pLongFirst = pHead2First;
			 pShortFirst = pHead1First;
		 }
		 //�������߲� 
		 for(int i = 0;i < mul;i++){
			 pLongFirst = pLongFirst.next;
		 }
		 //һ��Ƚ�
		 while(pLongFirst!=null&&pShortFirst!=null&&pLongFirst!=pShortFirst){
			 pLongFirst = pLongFirst.next;
			 pShortFirst = pShortFirst.next;
		 }
		 if(pLongFirst==pShortFirst){
		 pSameFirst = pLongFirst;
		 }
		 return pSameFirst;
    }
	
}
 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
