package ChandrikaTest;

import java.util.Arrays;

class par
{
	public static void disp()
	{
		System.out.println("WElcome to bkfs");
	}
	public void display()
	{
		System.out.println("WElcome to bkfs");
		String str1="welcome to bkfs";
		System.out.println(str1.replace(" " , ""));
	}
	public void displa2()
	{
		System.out.println("WElcome to ice");
	}
}

public class inher extends par {
	public void display()
	{
		System.out.println("WElcome to ice");
	}
	public void display1()
	{
		System.out.println("WElcome to ice");
	}
	public static void disp()
	{
		System.out.println("WElcome to ice");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inher in =new inher();
		//in.display();
		par inp1 =new par();
		//inp1.display();
		par p1 =new inher();
p1.display();
	
		inher.disp();
		//par.disp();
		String str1="welcome chandrika";
		str1=str1.replaceAll("\\s", "");
		//System.out.println(str1);
		char[] ch2=str1.toCharArray();
		Arrays.sort(ch2);
		//System.out.println(ch2);
		//System.out.println(ch2);
		
		
		

	}

}
