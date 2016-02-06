package jianzheoffer_33_findmin;
/**
 *����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����������������{3��32��321}��
 *���ӡ���������������ųɵ���С����Ϊ321323����
 * @author linxj
 *
 */
public class FindMin {
	public static void main(String[] args) {
		int[] array = {3,324,322,323};
		System.out.print(PrintMinNumber(array));
	}
	public static String PrintMinNumber(int [] numbers) {
		if(numbers==null || numbers.length==0)
			return "";
		//��������ƴ��
		numbers = select(numbers);
		String temp = String.valueOf(numbers[0]);
		for(int i=1; i<numbers.length; i++){
			String str1 = temp + String.valueOf(numbers[i]);
			String str2 = String.valueOf(numbers[i]) + temp;
			int result = str1.compareTo(str2);
			if(result > 0)
				temp = str2;
			else
				temp = str1;
		}
		return temp;
    }
	private static int[] select(int[] array){
		int outer, inner, min;
		for(outer=0; outer<array.length-1; outer++){
			min = outer;//��ʼ��minָ�������
			for(inner=outer+1; inner< array.length; inner++){
				if(array[inner] < array[min])
					min = inner;//ֻ������Сֵ����������һ�˱ȽϽ������ҵ���Сֵ���ٽ��н�����
			}
			int temp = array[outer];
			array[outer] = array[min];
			array[min] = temp;
		}
		return array;
	}
}
