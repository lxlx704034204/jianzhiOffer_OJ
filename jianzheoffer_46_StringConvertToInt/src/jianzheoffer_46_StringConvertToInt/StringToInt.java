package jianzheoffer_46_StringConvertToInt;
//�ַ���ת��������

public class StringToInt {
	//����"" "+123" "-123" �Լ���'0'~'9'������ַ� 
	public static void main(String[] args){
		System.out.println(StrToInt("-"));
	}
public static int StrToInt(String str) {
	int length = str.length();
	boolean minu = true;
        if(length <= 0||str == null||"".equals(str)){
        	return 0;
        }
        int count = 0;
        int num = 0;//���ֵ
       while(count < length){
    	   if(count == 0){//�ж�����
    		   if(str.charAt(0) == '+'){
    			   minu = true;//����
    			  count++;
    		   }else if(str.charAt(0) == '-'){
    			   minu = false;//����
     			  count++;
    		   }
    	   }
    	   if(length >= 2){
    	   if(str.charAt(count) >= '0' && str.charAt(count) <= '9'){
    		   num = num*10+(str.charAt(count)-'0');
    	   }else{
    		   return 0;
    	   }
    	   count ++;
       }
       }
       if(!minu){
    	   num = -num;
       }
       return num;
    }
}
