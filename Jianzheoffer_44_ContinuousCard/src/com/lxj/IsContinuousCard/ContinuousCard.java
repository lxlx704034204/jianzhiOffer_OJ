package com.lxj.IsContinuousCard;
/**
 * LL���������ر��,��Ϊ��ȥ����һ���˿���,���������Ȼ��2������,2��С��(һ����ԭ����54��^_^)...��������г����5����,�����Լ�������,
 * �����ܲ��ܳ鵽˳��,����鵽�Ļ�,������ȥ��������Ʊ,�ٺ٣���������A,����3,С��,����,��Ƭ5��,��Oh My God!������˳��.....LL��������,
 * ��������,������\С �����Կ����κ�����,����A����1,JΪ11,QΪ12,KΪ13�������5���ƾͿ��Ա�ɡ�1,2,3,4,5��(��С���ֱ���2��4),
 * ��So Lucky!����LL����ȥ��������Ʊ���� ����,Ҫ����ʹ�������ģ������Ĺ���,Ȼ���������LL��������Ρ�Ϊ�˷������,�������Ϊ��С����0��
 * @author linxj
 *
 */
public class ContinuousCard {
	public static void main(String[] args) {
		int[] array = {1,3,2,5,4};
		System.out.print(isContinuous(array));
	}
	public static boolean isContinuous(int [] numbers) {
		//1������
				//2�����ظ����֣��϶�����˳��
				//3����������֮�������Ҫ0�ĸ���
				//4���ܹ�0�ĸ���С����Ҫ�ĸ���������˳��
		int numberOfZeros = 0;
		int numberOfGap = 0;
		if(numbers==null || numbers.length==0)
			return false;
		insert(numbers);
		for(int i = 0;i < numbers.length;i++){
			if(numbers[i] == 0){
				numberOfZeros++;
			}
		}
		int small = numberOfZeros;//ȡ����С����
		int big = small + 1;//�����
		while(big < numbers.length){
			if(numbers[small] == numbers[big])//�ж���
				return false;
			numberOfGap += numbers[big] - numbers[small] - 1;
			small = big;
			++big;
		}
		return (numberOfGap > numberOfZeros)?false:true;
    }
	private static int[] insert(int[] array) {
		int outer, inner;
		for(outer=0; outer<array.length; outer++){
			int temp = array[outer];//��¼��ǰԪ�ص�ֵ��������λ�ã���Ϊ��ǰλ���ϵ����ݿ��ܻᱻ������ֵ
			inner = outer;
			while(inner>0 && array[inner-1]>temp){//inner>0������temp < array[inner-1]ǰ��
				//��û�ҵ�λ�ã�ָ����ǰ��
				array[inner] = array[inner-1];//��һֱ����
				inner--;
			}
			array[inner] = temp;
		}
		return array;
	}
}
