package treeFind;
/**
 * �������Ŷ�����A��B���ж�B�ǲ���A���ӽṹ��
 * @author linxj
 *
 */
public class TreeFind {
	
	    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
	    	boolean result = false;
	        if(root1 == null && root2 == null){
	        	return false; 
	        }else{
	        	if(root1.val== root2.val){
	        		result = DoesTree2hasTree1(root1,root2);
	        	}
	        	if(!result){
	        		result = HasSubtree(root1.left,root2);
	        	}
	        	if(!result){
	        		result = HasSubtree(root1.right,root2);
	        	}
	        }
	        return result;
	    }
	    public boolean DoesTree2hasTree1(TreeNode root1,TreeNode root2){
	    	if(root2 == null){
	    		return true;
	    	
	    	} if(root1 == null){
	    		return false;
	    	}
	    	if(root1.val != root2.val){
	    		return false;
	    	}
	    	return DoesTree2hasTree1(root1.left,root2.left)&&DoesTree2hasTree1(root1.right,root2.right);
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
