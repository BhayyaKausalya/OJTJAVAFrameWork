
package DriverFactory;

import org.testng.annotations.Test;

import DriverFactory.DriverScript;




public class AppTest {
@Test
	
	public void startTest()
	{
		try{
		DriverScript ds=new DriverScript();
			ds.ERP_Account();
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
	}

}
