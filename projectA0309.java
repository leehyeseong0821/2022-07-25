package projectA03;

public class projectA0309 {

	public static void main(String[] args) {
	int charCode =65;
		
		if((charCode>=65) && (charCode<=90)){
			System.out.println("대문자군요");
		}
		
		if((charCode>=97) && (charCode<122)) {
			System.out.println("소문자군요");
		}
		
		if(!(charCode<48) && !(charCode>57));
		System.out.println("0~9 숫자 이군요");
	    
	   int value =6;
	   
	   if(((value%2)==0) && ((value%3)==0)) {   //&&두개가 참이여야 결과값 AND
		   System.out.println("2또는 3의 배수 이군요");
	   }
	   if(((value%2)==0) || ((value%3)==0)) {   //||하나만 참이여도 참 OR  
		   System.out.println("2또는 3의 배수 이군요");
	   }
	   if(((value%2==0))^((value%3)==0)){
		   
	   }
	}

}
