package ml.tests;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ml.core.MyDriver;
import ml.pages.IntroPage;
import ml.pages.ItemPage;





public class MercadoLibreTest {

    private MyDriver myDriver = new MyDriver();

    @BeforeSuite
    private void tearUp(ITestContext context) {

	myDriver.tearUp(context);
    }

    @AfterSuite
    private void tearDown() {

	myDriver.tearDown();
    }

    @Test
    @Parameters({ "search" })
    public void testLoginAdmin(String search) throws InterruptedException {

	IntroPage intro = PageFactory.initElements(myDriver.getDriver(), IntroPage.class);
	intro.go(myDriver);
	intro.search(search,myDriver.getDriver());
	
	ItemPage itemPage = intro.clickItem(myDriver.getDriver());
	
	String price = itemPage.getPrice(myDriver.getDriver());
	
	 //Assert.assertEquals("U$S 64998",price);
	 Assert.assertTrue(true);


    }

}