package jianzheoffer_25_FindPath;

import java.util.ArrayList;

/**
 * ����һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
 * @author linxj
 *
 */
public class FindPath {
	int sum = 0;
	ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
	 ArrayList<Integer> aList = new  ArrayList<Integer>();//�൱��ջ
	 public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		
	        if(root == null){
	        	return arrayList;
	        }
	        //Stack<Integer> stack = new Stack<Integer>();
	        sum += root.val;
	       aList.add(root.val);
	        if(root.left== null && root.right == null&&sum == target){
	        	 ArrayList<Integer> path=new ArrayList<Integer>();
	        	for(int i = 0;i < aList.size();i++){
	        	 path.add(aList.get(i));
	        	}
	        	arrayList.add(path);
	        }else{
	        	if(root.left != null){
	        		FindPath(root.left,target);
	        	}
	        	if(root.right != null){
	        		FindPath(root.right, target);
	        	}
	        	//û�з��ϵģ���һ���ڵ㣬������   
	        }
	        if(aList.size()>0)
	        aList.remove(aList.size()-1);
	        sum-=root.val;
	        return arrayList;
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
