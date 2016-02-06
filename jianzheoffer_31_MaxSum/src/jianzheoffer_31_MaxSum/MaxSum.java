package jianzheoffer_31_MaxSum;

import javax.print.attribute.standard.Finishings;

/**
 *  ������������
 *  HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ����������鿪����,���ַ�����:�ڹ��ϵ�һάģʽʶ����,������Ҫ��������������������,������ȫΪ������ʱ��,����ܺý��������,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)����᲻�ᱻ������ס��
 * @author linxj
 *
 */
public class MaxSum {
	public static void main(String[] args){

		int[] array = {6,-3,-2,7,-15,1,2,2};
		int[] array1 = {1,-2,3,10,-4,7,2,-5};
		int[] array2 = {-2,-1,-2,-5};
		
		System.out.print(FindGreatestSumOfSubArray(array1));
	}
	 public static int FindGreatestSumOfSubArray(int[] array) {
		 if(array == null || array.length <= 0){
			 return 0;
		 }
	        int length = array.length;
	        int sum = 0;
	        int max = array[0];
	        int index = 0;
	        int end = 0;
	        for(int i = 0;i<length;i++){	        	
	        	
	        	if(sum <= 0){
	        		sum = array[i];
	        		index = i+1;
	        	}else{
	        		sum+=array[i];
	        	}
	        	if(max < sum){
	        		max = sum;
	        		end = i;
	        	}
	        }
	       return max;
	    }
}
