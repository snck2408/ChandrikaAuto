package ChandrikaTest;
interface test1
{
	int n1=6;
	 void disp();
	 default void disp1()
	 {
		 System.out.println("WELCOME tO ICE");
	 }
	 static void disp2()
	 {
		 System.out.println("WELCOME tO ICE123");
	 }
}

public class intface implements test1  {
	static int n4=4;
	public void disp()
	{
		System.out.println("ICE");
	}
	public void disp34()
	{
		System.out.println("ICE");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		intface i11=new intface();
		i11.disp();
		i11.disp();
		System.out.println(i11.n4);
	
		test1.disp2();
		System.out.println(test1.n1);
		test1 ccv=new intface();
		
		System.out.println(ccv.n1);
		

	}

}
