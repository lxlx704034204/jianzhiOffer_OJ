package jianzheoffer_40_findTheOnce;
/**
 * һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�
 * @author linxj
 *
 */
public class FindTheOnce {
	public static void main(String[] args){
		int[] array = {2,4,3,6,3,2,5,5};
		int num1[] = new int[1];
		int num2[] = new int[1];
		FindNumsAppearOnce(array,num1 , num2);
	}
public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array == null || array.length <= 2){
        	return;
        }
        int result = 0;
        for(int i = 0;i < array.length;i++){
        	result ^= array[i];
        }
        int num = findFirstOne(result);//�ҵ�ֵΪ1��λ��
        for(int i = 0;i < array.length;i++){
        	if(isBit1(array[i], num)){//��Ϊ����
        		num2[0] ^= array[i];
        	}else{
        		num1[0] ^=  array[i];
        	}
        }
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }
public static int findFirstOne(int result){
	int count = 0;
	while((result&1)==0){
		result = result >> 1;
        count++;
	}
	return count;
}
public static boolean isBit1(int result,int num){
	result=result>>num;
    return (result&1)==1;
}
}
