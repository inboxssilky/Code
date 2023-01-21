package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import config.TestBase;
import pages.welcomePage;

public class TestCaseOne extends TestBase {
	welcomePage wp;
  
  @BeforeMethod
  public void beforeMethod(){
	  TestBase.systemProperty();
	  wp = new welcomePage(dr);
}

  @AfterMethod
  public void afterMethod() {
dr.quit();
  }

  @Test
  public void titleTest() {
 String str = wp.getText();
 Assert.assertEquals("Welcome", str);
  }
  
  @Test
  public void herbalteaTest() {
	  String str = wp.getTextHerbalTea();
	  System.out.println("pass");
Assert.assertEquals("Herbal Tea", str);
} 
}
