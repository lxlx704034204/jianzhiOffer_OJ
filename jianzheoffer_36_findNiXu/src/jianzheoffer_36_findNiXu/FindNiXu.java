package jianzheoffer_36_findNiXu;
/**
 * �������е��������֣����ǰ��һ�����ִ��ں�������֣����������������һ������ԡ�����һ�����飬�����������е�����Ե�������
 * @author linxj
 *
 */
public class FindNiXu {
	private static int[] array;
	public static void main(String[] args){
		int[] array = {1,2,3,4,7,6,5};
		System.out.println(InversePairs(array));
	}
	 public static int InversePairs(int[] marray) {
		array = marray;
		 if(array == null || array.length <= 0){
			 return 0;
		 }
		 int[] copy = new int[array.length];
		 int count = InversePairsCore(copy, 0, array.length-1);
		 return count;
	 }
	 public static int  InversePairsCore(int[] result,int start,int end){
		 if(start == end){
			 return 0;
		 }
		 int mid = (start+end)/2;
		 int leftCount = InversePairsCore(result, start, mid);
		 int rightCount = InversePairsCore(result,mid+1,end);
		//��ʼ�ϲ����������������У��߽������򣬱�ͳ�������
	        //����ָ��
	        int leftPtr=mid;
	        int rightPtr=end;
	        int mergeCount=0;
	        int j=end;
		 while(leftPtr>=start && rightPtr>mid){
	            if(array[leftPtr]>array[rightPtr]){//������>�ұߣ����������
	                mergeCount+=rightPtr-mid;
	                result[j--]=array[leftPtr--];
	            }else{
	            	if(array[leftPtr]<array[rightPtr])
	            		result[j--]=array[rightPtr--];
	            	else{
	            		mergeCount+=rightPtr-mid-1;
	            		result[j--]=array[leftPtr--];
	            		result[j--]=array[rightPtr--];
	            	}
	            }
	        }
	        while(leftPtr>=start){
	        	result[j--]=array[leftPtr--];
	        }
	        while(rightPtr>mid){
	        	result[j--]=array[rightPtr--];
	        }
	        for(j=end;j>=0;j--){
	        	array[j]=result[j];
	        }
	        return leftCount + rightCount + mergeCount;
	 }
}
