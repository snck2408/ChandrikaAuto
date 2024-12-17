package ChandrikaTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testassverify {
  @Test
  public void f() {
	  SoftAssert as1=new SoftAssert();
	  as1.assertEquals(1, 1);
	  System.out.println("hELLO");
	  as1.assertEquals(1, 2);
	  System.out.println("hELLO1");
	  as1.assertAll();
	  
	 /* Assert.assertEquals(1, 1);
	  System.out.println("hELLO");
	  Assert.assertEquals(1, 2);
	  System.out.println("hELLO1");*/
  }
}
