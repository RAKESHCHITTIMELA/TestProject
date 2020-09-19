package tests;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Practice1 {
public static AppiumDriver driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		caps.setCapability(MobileCapabilityType.NO_RESET, true);
		caps.setCapability(MobileCapabilityType.APP, "D:\\\\Recovered Data\\\\Downloads\\\\IntelliGO.apk");
		caps.setCapability("autoGrantPermissions", true);


		URL url=new URL("http://127.0.0.1:4723/wd/hub");
				
				 driver = new AppiumDriver<MobileElement>(url,caps);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					System.out.println("Application Started....");
					
					driver.findElementById("com.affluencesystems.admin:id/text_email").sendKeys("haripriyaa@affluencesystems.com");
					driver.findElementById("com.affluencesystems.admin:id/text_user_pass").sendKeys("Aff@1234");
					driver.findElementById("com.affluencesystems.admin:id/text_sign_in").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RadioButton").click();
					
					driver.findElementByXPath("//*[@text='Update']").click();
					if(driver.findElementById("com.affluencesystems.admin:id/middle").isDisplayed())
				    {
				    	System.out.println("Login Successfully");
				    }
				    else
				    {
				    	System.out.println("Login failed");
				    }
					
					driver.findElementById("com.affluencesystems.admin:id/menu_img").click();
					driver.findElement(MobileBy.AndroidUIAutomator(
					        "new UiScrollable(new UiSelector().scrollable(true))" +
					         ".scrollIntoView(new UiSelector().resourceIdMatches(\"com.affluencesystems.admin:id/settings_card\"))"));


					driver.findElementById("com.affluencesystems.admin:id/settings_card").click();
					driver.findElementByXPath("//*[@text='Config Vehicle']").click();
					driver.findElementById("com.affluencesystems.admin:id/no_of_fences").click();
					driver.findElementById("com.affluencesystems.admin:id/floating_action_text_add").click();
					Thread.sleep(8000);
					driver.findElementById("com.affluencesystems.admin:id/create").click();
//					TouchAction touchAction = new TouchAction(driver);
//					touchAction.tap((PointOption.point(529, 1129).wait()));
//					TouchAction touchAction = new TouchAction(driver).tap(PointOption.point(529,1129)).waitAction(waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(529, 1129)).release().perform();	
//					TapOptions tap = new TapOptions();
//					touchAction.tap(tap);
//					driver.findElementById("com.affluencesystems.admin:id/map").click();
//					Location location = new Location(17.291032, 78.605287, 0);
//					driver.setLocation(location);
//					driver.findElementById("com.affluencesystems.admin:id/done").click();
//					driver.findElementById("com.affluencesystems.admin:id/et_fence_name").sendKeys("fence100");
//					driver.findElementById("com.affluencesystems.admin:id/radius").sendKeys("10");
//					driver.findElementById("com.affluencesystems.admin:id/ok").click();
//					if(driver.findElementByXPath("//*[@text='fence100']").isDisplayed())
//					{
//						System.out.println("New Radius Geofence added successfully");
//					}else
//					{
//						System.out.println("New Radius Gencefence creation failed");
//
//					}			
//
//					driver.findElementById("com.affluencesystems.admin:id/floating_action_text_add").click();
//					Thread.sleep(8000);
					driver.findElementById("com.affluencesystems.admin:id/custom").click();
					driver.findElementById("com.affluencesystems.admin:id/create").click();
					driver.findElementById("com.affluencesystems.admin:id/map").click();
					driver.setLocation(new Location(17.330008, 78.603935, 0));
					Thread.sleep(2000);
					driver.findElementById("com.affluencesystems.admin:id/map").click();
					driver.setLocation(new Location(18.352951, 78.396157, 0));
					driver.findElementById("com.affluencesystems.admin:id/map").click();
					driver.setLocation(new Location(19.999851, 78.687877, 0));
					driver.findElementById("com.affluencesystems.admin:id/done").click();
					driver.findElementById("com.affluencesystems.admin:id/et_fence_name").sendKeys("fence200");
					driver.findElementById("com.affluencesystems.admin:id/ok").click();
					if(driver.findElementByXPath("//*[@text='fence200']").isDisplayed())
					{
						System.out.println("New Custom Geofence added successfully");
					}else
					{
						System.out.println("New Custom Gencefence creation failed");

					}

	}
	

}
