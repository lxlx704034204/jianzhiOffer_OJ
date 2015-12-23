package com.offer.question08;

/**
 * ��ת������Сֵ
 * ԭ������������{1,2,3,4,5}
 * ���е�һ����ת����{4,5,1,2,3}
 * �ҳ���ת������Сֵ
 */
public class RotateArrayMin {
	
	public static void main(String[] args){
		int[] array = {4,5,6,1,2,3};
		System.out.print(findMin(array));
	}
	
	//���ö��ֲ���
	//��Ϊ���������ӵ�������
	private static int findMin(int[] array){
		if(array == null || array.length <= 0)
			return -1;
		int lowerBound, upperBound, currentIn;
		lowerBound = 0;
		upperBound = array.length -1;
		currentIn = lowerBound;
		while(array[lowerBound] >= array[upperBound]) {
			if(lowerBound == upperBound-1) 
				return array[upperBound]; 
			currentIn = (lowerBound + upperBound)/2;
			//���lowerBound��upperBound��currentIn��ȣ���˳�����
			if(array[lowerBound] == array[upperBound] && array[lowerBound] == array[currentIn])
				return getMinInOrder(array, lowerBound, upperBound);
			if(array[currentIn] >= array[lowerBound])
				lowerBound = currentIn;
			else if (array[currentIn] <= array[upperBound])
				upperBound = currentIn;
		}
		return array[currentIn];
	}

	private static int getMinInOrder(int[] array, int lowerBound, int upperBound) {
		int min = array[lowerBound];
		for(int i=lowerBound+1; i<=upperBound; i++) {
			if(array[i] < min)
				min = array[i];
		}
		return min;
	}
}
