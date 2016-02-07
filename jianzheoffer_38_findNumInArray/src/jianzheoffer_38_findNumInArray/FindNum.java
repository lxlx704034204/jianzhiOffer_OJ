package jianzheoffer_38_findNumInArray;
/**
 * ͳ��һ�����������������г��ֵĴ�����
 * @author linxj
 *˼·���ҳ���һ������λ�ã��ҳ����һ������λ�ã������
 *�ҵ�һ����˼·���е㷨�ҵ�����k��λ��n���ж�n��ǰһ���ǲ���k��������ǣ�֤�����ǵ�һ������ǰ��һ�Ρ�
 */
public class FindNum {
	public static void main(String[] args){
		int[] array = {2,2,3,3,3,3,3};
		System.out.println(GetNumberOfK(array, 2));
		
	}
	public static int GetNumberOfK(int [] array , int k) {
		if(array == null||array.length <= 0){
			return -1;
		}
		int end = array.length;
		if(GetFirst(array, 0, end, k)!=-1&&GetEnd(array, 0, end, k)!=-1){
			int i = GetEnd(array, 0, end-1,k);
			int j = GetFirst(array, 0, end-1,k);
				
	    return GetEnd(array, 0, end-1,k)-GetFirst(array, 0, end-1,k)+1;
		}
		return -1;
    }
	public static int GetFirst(int [] array , int start,int end,int k){
		if(start >= end){//������k
			return -1;
		}
		int mid = (start + end)/2;
		if(mid == 0){
			return mid;
		}
		if(array[mid] == k){
			if(array[mid-1] != k){
				return mid;
			}else{
				end = mid;
			}
		}else if(array[mid] > k){
			end = mid;
		}else{
			start = mid+1;
		}
		return GetFirst(array, start, end, k);
	}
	public static int GetEnd(int [] array , int start,int end,int k){
		if(start > end){
			return -1;
		}
		int mid = (start + end)/2;
		if(mid == array.length-1){
			return mid;
		}
		if(array[mid] == k){
			if(array[mid+1] != k){
				return mid;
			}else{
				start = mid+1;
			}
		}else if(array[mid] > k){
			end = mid;
		}else{
			start = mid+1;
		}
		return GetEnd(array, start, end, k);
	}
}
