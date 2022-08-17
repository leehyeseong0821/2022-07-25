package projectA03;

import java.util.Scanner;

public class projectA0312 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int hour = in.nextInt();
		int minute = hour*60;
		int second = minute*60;
		
		System.out.println(hour + "시간은");
		System.out.println(minute + "분 또는");
		System.out.println(hour + "초 입니다.");
		
		
		
		in.close();
		
		

	}

}
