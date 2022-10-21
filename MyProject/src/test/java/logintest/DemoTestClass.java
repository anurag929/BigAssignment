package logintest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import newpro.Mavengmap;


public class DemoTestClass {
	@Test
	public void sum() {
		System.out.println("Sum");
		int a= 20;
		int b= 10; 
		Assert.assertEquals(30, a+b);
	}
	@Test
	public void Sub() {
		System.out.println("Sub");
		int a= 20;
		int b= 10; 
		Assert.assertEquals(10, a-b);
	}
	@Test
	
	public void mul() {
		System.out.println("Mul");
		int a= 20;
		int b= 10; 
		Assert.assertEquals(200, a*b);
	}
	@Test
	public void div() {
		System.out.println("Div");
		int a= 20;
		int b= 10; 
		Assert.assertEquals(2, a/b);
	}
	@Test
	public void map()
	{
		Mavengmap mymap = new Mavengmap();
		Assert.assertEquals(1,mymap.map(1));
		

	}
	
	

}
