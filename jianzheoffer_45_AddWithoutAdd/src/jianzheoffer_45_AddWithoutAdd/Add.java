package jianzheoffer_45_AddWithoutAdd;
/**
 * дһ������������������֮�ͣ�Ҫ���ں������ڲ���ʹ��+��-��*��/����������š�
 * @author linxj
 *
 */
public class Add {
	public static void main(String[] args){
		System.out.println(Add(1,2));
	}
    public static int Add(int num1,int num2) {
        int sum,carry;
        while(num2 != 0){
            sum = num1 ^ num2;
            carry = (num2 & num1)<<1;
            num1 = sum;
            num2 = carry;
        }
        return num1;
    }
}
