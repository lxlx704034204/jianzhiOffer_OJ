package com.lxj.printTopToBottom;

import java.util.ArrayList;
import java.util.LinkedList;
/**
 * �������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
 * ˼·����һ����������ڵ㣬popһ���ڵ�Ͱ������ӽڵ�ӽ���
 * @author linxj
 *
 */
public class PrintFromTopToBottom {
	 public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
	        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
	        ArrayList<Integer> aList = new ArrayList<Integer>();
	        if(root == null){
	        	return aList;
	        }
	        list.add(root);
	        while(!list.isEmpty()){	        
	        TreeNode pop = list.pop();
	        aList.add(pop.val);
	        if(pop.left!=null){
	        	list.add(pop.left);
	        }
	        if(pop.right!=null){
	        	list.add(pop.right);
	        }
	        }
	        return aList;
	    }
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
}
