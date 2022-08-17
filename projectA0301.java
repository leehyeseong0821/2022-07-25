package projectA03;

public class projectA0301 {

	public static void main(String[] args) {
		boolean b1 = false;
		
		byte bt1 = 10;
		int i = 20;
		
		bt1 = (byte)i; // int를 byte로 변환하기위해 (byte)입력
		i = bt1;
		
		int va1 =10; //10진수
		int va2 =010;//8진수
		int va3 =0x10;//16진수
		int va4 =0b0010;//2진수
		System.out.println(va1);
		System.out.println(va2);
		System.out.println(va3);
		System.out.println(va4);
		System.out.println(Integer.toBinaryString(va4));
		System.out.println();
		int result=0;
		result = va1+va2+va3+va4;
		System.out.println(result);

  	}

}
