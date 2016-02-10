package jianzheoffer_42_findSequenceWithSum;

import java.util.ArrayList;

/**
 * С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100�����������������ڴ�,�����뾿���ж������������������е�
 * ��Ϊ100(���ٰ���������)��û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22�����ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS
 * ��������������? Good Luck! 
 * @author linxj
 *
 */
public class FindSequence {
	public static void main(String[] args){
		ArrayList<ArrayList<Integer> > aLists = FindContinuousSequence(1);
		for(int i = 0;i < aLists.size();i++){
			System.out.println(aLists.get(i).toString());
		}
		
	}
	public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer> > aLists = new ArrayList<ArrayList<Integer> >();
		//ArrayList<Integer> aList = new ArrayList<Integer>();
		int small = 1;
		int big = 2;
		int endSum = small + big;
		 int mid = (1+sum)/2;
		 if(sum < 3){
			 return aLists;
		 }
		while(small < mid){

			if(endSum < sum){
				big++;
				endSum+=big;
				
			}else if(endSum > sum){
				
				endSum-=small;
				small++;
			}else{
				ArrayList<Integer> aList = new ArrayList<Integer>();
				int count = small;
				while(count <= big){
					aList.add(count);
					count++;
				}
				aLists.add(aList);
				big++;
				endSum+=big;
				
			}
		}
		return aLists;
    }
}
