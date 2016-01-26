package PrintMartix;

import java.util.ArrayList;
import java.util.List;
/**
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣����磬����������¾���
 *  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9
 *  ,5,6,7,11,10.
 * @author linxj
 *
 */
public class PrintMartix {
	public static void main(String[] args){
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] matrix1 = {{1,2},{3,4}};
		int[][] matrix2 = {{1},{2},{3},{4}};
		int[][] matrix3 = {{1,2},{3,4},{5,6},{7,8},{9,10}};
		List<Integer> list = printMatrix(matrix3);
		System.out.print(list.toString());
	}
	
	public static ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int row = matrix.length;
		int colum = matrix[0].length;
		if(matrix == null||colum<=0||row<=0 ){
			return null;
		}
		int start = 0;
		while(row > start*2&&colum > start*2){
			printCricle(list,row,colum,start,matrix);
			start++;
		}
		
	   return list;
    }
	public static  void printCricle(List<Integer> list,int row,int colum,int start,int[][] matrix){
		
				int rowNum = colum-start-1;
			int columNum = row - start-1;
			//�������Ҵ�
			for(int i = start;i <= rowNum;i++){
				list.add(matrix[start][i]);
			}
			//�������´�
			if(start < columNum){
				for(int i = start+1;i <= columNum;i++){
					list.add(matrix[i][rowNum]);
				}
			}
			//���������
			if(start < rowNum&&start < columNum ){
				for(int i = rowNum-1;i >= start;i--){
					list.add(matrix[columNum][i]);
				}
			}
		
			//�������ϴ�
					if(start < rowNum &&start < columNum-1 ){
						for(int i = columNum-1;i >= start+1;i--){
							list.add(matrix[i][start]);
						}
					}
			}
}
