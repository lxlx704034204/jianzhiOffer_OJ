package jianzheoffer_29NumOutOfHalf;
/**
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡���������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}����������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
 * @author linxj
 *˼·��������������һ����ʾ������һ����ʾ��ֵ������ͬʱ������1������ͬ������һ��Ϊ0ʱ��Ҫ���������������0���Ǹ�ֵ���ǳ��������ġ�
 */
public class Partition {
	public static void main(String[] args){
		int[] array = {1,2,3,2,2,2,5,4,2};
		int[] array1 = {};
		int[] array2 = {1,2,3,2,2,4};
		System.out.print(MoreThanHalfNum_Solution(array));
		System.out.print(MoreThanHalfNum_Solution(array1));
		System.out.print(MoreThanHalfNum_Solution(array2));
	}
	public static int MoreThanHalfNum_Solution(int [] array) {
		if(array == null||array.length<=0){
			return 0;
		}
     int mNum = 1;
     int mData = array[0];
     int length = array.length;
     for(int i = 1;i < length;i++){
    	 if(mData != array[i] ){
    		 mNum--;
    	 }else if(mData == array[i]){
    		 mNum++;
    	 }
     if(mNum == 0){
    	 mData = array[i];
    	 mNum=1;
     }
     }
     //�ж��Ƿ񳬹�һ��
     int count = 0;
     for(int i = 0;i < length;i++){
    	 if(array[i]==mData){
    		 count++;
    	 }
     }
     if(count*2 <= length){
    	 mData = 0;
     }
     return mData;
    }
}
