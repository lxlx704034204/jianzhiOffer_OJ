package com.lxj.Main;

import java.util.Stack;
/**
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
 * ˼·�������ӵ���һ��ջ����Ҫpopʱ��һ��ջ������ȫ�ŷŵڶ���ջ���ٳ�ջ��
 * @author linxj
 *
 */
public class Main {
	    Stack<Integer> stack1 = new Stack<Integer>();
	    Stack<Integer> stack2 = new Stack<Integer>();
	    public static void main(String[] args){
	    	Main m = new Main();
	    	m.push(6);
	    	m.push(5);
	    	m.push(10);
	    	System.out.print(m.pop());
	    	System.out.print(m.pop());
	    }
	    public void push(int node) {
	    	
	        stack1.add(node);
	    }
	    
	    public int pop() {
	    	if(stack2.size() == 0&&stack1.size()==0){
	    		return -1;
	    	}
	    	
	    	if(stack2.isEmpty()){
	    		while(stack1.size()>0){
	    			stack2.add(stack1.pop());
	    		}
	    	}
	    	if(stack2.isEmpty()) {
				try {
					throw new Exception("Queue is Empty");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	    	return stack2.pop();
	    }
	
}
