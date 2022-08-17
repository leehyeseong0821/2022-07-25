package projectA03;

public class projectA0306 {

	public static void main(String[] args) {
		int x =-10;
		
		int result =0;
		
		short s =100;
		short result1 =0;
		result1 =s; //short 안에는 -가없으므로 -는 불가
		
//		++ --
		int x1 =10;
		int x2 = x++; //x2=10, x1=11;
		x2 = ++x1; // x1=12; x2=12;
		
		int j = x1+10+x2;
		
		 j = x1-10-x2;
		 
		 j= x1*10*x2;
		 
		 j= (x1+x2)*10;
		 
		 j=x1/10;
		 j=x1*10;
		 j=x1%10;
		 
		 x=10;
		 j =x++ +10;
		 System.out.println(j);
		 System.out.println(x);
		 x=10;
		 j=++x+10;
		 System.out.println(j);
		 x=10;
		 j =(x+1)+10; //풀어서 쓰느게 좋다
		 System.out.println(j);
		 System.out.println();
		 int sx =0x01;  
		 System.out.println(sx); 
		 System.out.println(sx<<1);//쉬프트를 << 좌로이동 비트를
		 System.out.println(sx<<2);
		 System.out.println(sx<<3);
		 System.out.println();
		int ss=0x10;
		System.out.println(ss);
		System.out.println(ss>>1);
		System.out.println(ss>>2);
		System.out.println(ss>>3);
		int fx=10;
		int fy=20;
		System.out.println(fx<fy);
		if(fx>fy) {
			System.out.println("fx>fy");
		}
		System.out.println(fx>fy);
		
		fx=11;
		fy=11;
		System.out.println(fx==fy);
		fx=10;
		fy=20;
		System.out.println(fx>=fy);
		System.out.println(fx<=fy);
		

	}

}
