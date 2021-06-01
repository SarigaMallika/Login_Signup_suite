package Bills_positive_scenarios;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import Reusable_Functions.Generic_function;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Bills_positive_scenarios extends Generic_function{
		public static boolean value;
		public static String str;
		
		/*Browser launch*/
		@Given("browser is open")
		public void browser_launching() throws Exception {
			try {
				browserlaunch();
			} catch (Exception e) {
				e.getMessage();
				takeScreenShot("browser launching");
			}
		}

		/*TC 001 - */
		@When("")
		public void bills_positive_tc_001() throws Exception {
			try {
				click("welcome_login");
				browser_wait(12);
				driver.findElement(By.xpath(OR_reader("Object_locator", "login_phone_number"))).sendKeys(td_reader("login_phone_number",6));
				driver.findElement(By.xpath(OR_reader("Object_locator", "login_password"))).sendKeys(td_reader("login_password",7));
				click("login");
				browser_wait(20);
				click("home_circles");
				browser_wait(12);
				value = driver.findElement(By.xpath(OR_reader("Object_Locator", "circles_page_title"))).isDisplayed();
				Assert.assertEquals(true,value);
				browser_wait(12);
				click("circles_add_patner_button");
				browser_wait(12);
				value = driver.findElement(By.xpath(OR_reader("Object_Locator", "add_patner_page_title"))).isDisplayed();
				Assert.assertEquals(true,value);
				Assert.assertEquals(driver.findElement(By.xpath(OR_reader("Object_Locator","add_patner_proceed_button"))).isEnabled(),true);
			} catch (IOException e) {
				e.getMessage();
				takeScreenShot("bills_positive_tc_001");
			}
		}

		/*TC 002 - */
		@Given("")
		public void bills_positive_tc_002() throws Exception {
			try {
				
			}catch (Exception e) {
				e.getMessage();
				takeScreenShot("bills_negative_tc_002");
			}	
		}

		/*TC 003 - */
		@Given("")
		public void bills_positive_tc_003() throws Exception {
			try {
				
			}catch (Exception e) {
				e.getMessage();
				takeScreenShot("bills_positive_tc_003");
			}	
		}

		/*TC 004 - */
		@Given("")
		public void bills_positive_tc_004() throws Exception {
			try {
			
			}catch (Exception e) {
				e.getMessage();
				takeScreenShot("bills_positive_tc_004");
			}	
		}

		/*TC 005 - */
		@Given("")
		public void bills_positive_tc_005() throws Exception {
			try {
				
			}catch (Exception e) {
				e.getMessage();
				takeScreenShot("bills_positive_tc_005");
			}	
		}

		/*TC 006 - */
		@Given("")
		public void bills_positive_tc_006() throws Exception {
			try {
				
			}catch (Exception e) {
				e.getMessage();
				takeScreenShot("bills_positive_tc_006");
			}	
		}

		/*TC 007 - */
		@Given("")
		public void bills_positive_tc_007() throws Exception {
			try {
				
				window_close();
			}catch (Exception e) {
				e.getMessage();
				takeScreenShot("bills_positive_tc_007");
			}	
		}
}
