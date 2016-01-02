package com.lxj.jianzhi;
/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * @author linxj
 *
 */
public class FeiBo {
	public static void main(String[] args){
		System.out.println(Fibonacci(3));
	}
	//非递归
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
	
	//递归
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
