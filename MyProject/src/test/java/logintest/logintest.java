package logintest;
import org.testng.Assert;
import org.testng.annotations.Test;

import newpro.NewMaven;



public class logintest {
	@Test
	
	public void testlogin1()
	{
		NewMaven myapp = new NewMaven();
		Assert.assertEquals(0,myapp.userLogin("abc","abc123"));
		
	}
	@Test
	public void testlogin2()
	{
		NewMaven myapp = new NewMaven();
		Assert.assertEquals(1,myapp.userLogin("abc","abc123"));
		
	}

	

}
