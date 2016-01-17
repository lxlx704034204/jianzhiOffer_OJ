package mirror;
/**
 * ���������Ķ�����������任ΪԴ�������ľ��� 
��������:
�������ľ����壺Դ������ 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	���������
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
 * @author linxj
 *
 */
public class Mirror {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	   public void MirrorTree(TreeNode root) {
	        if(root == null){
	        	return;
	        }
	      //�ݹ��������������������������������Ҷ�ӽ��
	        if(root.left==null && root.right==null)//ע�⣺��&&�������� ||
	        	/*�𰸴���:���ύ�ĳ���û��ͨ�����еĲ�������
	        	��������:
	        	{8,7,#,6,#,5,#,4}
	        	��Ӧ���Ӧ��Ϊ:
	        	{8,#,7,#,6,#,5,#,4} */
	            return;
	        //�Ƚ��������������ٵݹ齻��������
	        //�����ڵ�
	        TreeNode temp;
	        temp = root.left;
	        root.left = root.right;
	        root.right = temp;
	        MirrorTree(root.left);
	        MirrorTree(root.right);
	    }
}
