package projectA03;

public class projectA0304 {
 int v1=10;
 public void method1() {
	 int v1=15;
 }
	
 public void method2() {
	 v1=10;
 }
	
	public static void main(String[] args) {
		int v1=15;
		{
			int v2=10;
			{
				int v3=20;
				System.out.println(v1+v2+v3);
			}
			System.out.println(v1+v2);
		}
		System.out.println(v1);
		
		

	}

}
