package projectA03;

public class projectA0303 {
        static int ib=20;
        int iib=20;
        {
        	int ia=20; //{}이블락 안에서만 사용가능
        }
        static {
        	int ic=10; //ic마찬가지 {} static 블락안에서만 사용가능
        }
	
	
	public static void main(String[] args) {
	 System.out.println(ib);
	 projectA0303 proj = new projectA0303();
	 System.out.println(proj.iib);
	 
	 
	 int var1;
	 
	 if(true) {
		 int var2;
		 var1=10;
		 var2=20;
	 }
	 {
		 
		 int var3;
		 var1= 30;
//		 var2 =30; 사용x if안에 {}안에서만 사용 가능하기 때문이다.
		 var3 =30;
	 }
		

	}

}
