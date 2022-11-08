package logintest;

import org.testng.Assert;
import org.testng.annotations.Test;

import newpro.Login;
import newpro.Mavengmap;
import newpro.New_Dshop;



public class Dshop_test {
	
		@Test
		
		public void Register1()
		{

			New_Dshop myid = new New_Dshop();
			Assert.assertEquals(0,myid.Demo_webshop(1));
			
			

		
		}
//		@Test
//		public void Register2()
//		{
//
//			
//			Login ln1 = new Login();
//			ln1.login1();
//			
//
//		
//		}
//		

}
