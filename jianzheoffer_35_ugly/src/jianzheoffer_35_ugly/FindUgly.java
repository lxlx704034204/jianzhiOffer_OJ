package jianzheoffer_35_ugly;
/**
 * ��ֻ��������2��3��5��������������Ugly Number��������6��8���ǳ�������14���ǣ���Ϊ����������7�� ϰ�������ǰ�1�����ǵ�һ��������
 * �󰴴�С�����˳��ĵ�N��������
 * ˼·���ѳ�����С�������е�N���Ϳ����ˡ��ֱ��ڼ��е������д�С����*2��*3��*5�ҳ���һ�����ע�ⲻ��ÿ�ζ���1��ʼ�ң����Ǵ���һ�ε��ҵ�λ�ü̳���
 * ���ҡ�
 * @author linxj
 *
 */
public class FindUgly {
	public static void main(String[] args){
		System.out.println(GetUglyNumber_Solution(1));
	}
	 public static int GetUglyNumber_Solution(int index) {
		 if(index <= 0){
	        return 0;
		 }
		 int[] uglys = new int[index];
		 int indexNum = 1;
		uglys[0] = 1;
		 int num2 = 1;
		 int num3 = 1;
		 int num5 = 1;
		 int index2 = 0;
		 int index3 = 0;
		 int index5 = 0;
		 while(indexNum < index){
			 uglys[indexNum] = min(num2*2, num3*3, num5*5);//�ҳ�����������Сֵ
			 while(num2*2<=uglys[indexNum]){
				 index2++;
				 num2=uglys[index2];
			 }
			 while(num3*3<=uglys[indexNum]){
				 index3++;
				 num3 = uglys[index3];
			 }
			 while(num5*5<=uglys[indexNum]){
				 index5++;
				 num5 = uglys[index5];
			 }
			indexNum++;
		 }
		 return uglys[index-1];
	    }
	 public static int min(int i,int j,int k){
		 int min = i < j?i:j;
		 min = min < k?min:k;
		 return min;
	 }
}
