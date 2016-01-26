package MinInStack;

import java.util.Stack;
/**
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��СԪ�ص�min������
 * ˼·���ø���ջ���浱ǰ����С����ջ1�ж��ٸ���������ջ���ж��ٸ�
 * @author linxj
 *
 */
public class MinInStack {
	  Stack<Integer> stack1 = new Stack<Integer>();
	  Stack<Integer> stack2 = new Stack<Integer>();//����ջ
		    
		    public void push(int node) {
		        stack1.push(node);
		        if(stack2.isEmpty()){
		        	stack2.push(node);
		        }else if(stack2.peek()>node){
		        	stack2.push(node);
		        }else{
		        	stack2.push(stack2.peek());
		        }
		    }
		    
		    public void pop() {
		    	if(stack2.isEmpty()){
		    		return;
		    	}else{
		    	stack2.pop();
		    	stack1.pop();//����ջҲҪ��ջ����֤��ջ����ջ1��ǰ������Сֵ
		    	}
		    	
		    }
		    
		    public int top() {
		    	if(!stack1.isEmpty())
		        return stack1.peek();
		    	else{
		    		return 0;
		    	}
		    }
		    //��ȡ��ǰ��Сֵ
		    public int min() {
		    	if(!stack1.isEmpty())
		    		 return stack2.peek();
			    	else{
			    		return 0;
			    	}
		       
		    }
	
}
