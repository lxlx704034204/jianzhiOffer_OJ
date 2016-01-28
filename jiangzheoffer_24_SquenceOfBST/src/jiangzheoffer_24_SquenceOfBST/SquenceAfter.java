package jiangzheoffer_24_SquenceOfBST;

import java.util.Arrays;

/**
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ��������������Yes,�������No���������������������������ֶ�������ͬ��
 * @author linxj
 *
 */
public class SquenceAfter {
	public boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence == null||sequence.length<=0){
			return false;
		}
		int length = sequence.length;
        int root = sequence[length-1];
        int mid = 0;
        //���������������������н��С�ڸ��ڵ�
        //���ҳ����������ֽ��
        for(int i = 0;i < length-1; i++ ){//�˴�Ϊsequence.length-1��������sequence.length
        	if(sequence[i] < root){
        		mid++;//�ҵ��м��
        		break;
        	}   	
        }
      //�����������ڸ��ڵ�
        //�ҷֽ���ʱ���Ѿ�Ĭ�������������нڵ�ֵС�ڸ��ڵ㣬����ֻ���ж�������
        for(int i = mid;i< length-1;i++){//�˴�Ϊsequence.length-1��������sequence.length
        	if(sequence[i] < root){
        		return false;
        	}
        }
        boolean leftFlag = true;
        boolean rightFlag = true;
        if(mid>0){//����������
        	int[] left = Arrays.copyOfRange(sequence, 0, mid);//������i
        	leftFlag = VerifySquenceOfBST(left);
        }
        if(mid < length-1){
        	 int[] right = Arrays.copyOfRange(sequence, mid, length-1);
        	 rightFlag = VerifySquenceOfBST(right);
        }
          
        return leftFlag&&rightFlag;
    }
}
