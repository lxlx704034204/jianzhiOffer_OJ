package com.lxj.jianzhi;
/**
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n�
 * @author linxj
 *
 */
public class FeiBo {
	public static void main(String[] args){
		System.out.println(Fibonacci(3));
	}
	//�ǵݹ�
	public static int Fibonacci(int n){
		int mFirst = 0;
		int mTwo = 1;

		int sum = mFirst + mTwo;
		if(n <= 0){
			return 0;
		}
		if(n == 1){
			return 1;
		}

		for(int i = 2;i <= n;i++){
			sum = mFirst + mTwo;
			mFirst = mTwo;
			mTwo = sum;
			//sum+= sum;
		}
		return sum;
	}
	
	//�ݹ�
		public static int Fibonacci1(int n){
			if(n <= 0){
				return 0;
			}
			else if(n == 1){
				return 1;
			}
			else{
				return Fibonacci1(n-1)+Fibonacci1(n-2);
			}
		}
}