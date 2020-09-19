package tests;


import java.net.MalformedURLException;
import java.net.URL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Practice2 {
public static AppiumDriver driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");	
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
//		caps.setCapability(MobileCapabilityType.NO_RESET, true);
		caps.setCapability(MobileCapabilityType.APP, "D:\\Recovered Data\\Downloads\\IntelliGO.apk");
		caps.setCapability("autoGrantPermissions", true);


		URL url=new URL("http://127.0.0.1:4723/wd/hub");
				
				 driver = new AppiumDriver<MobileElement>(url,caps);
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					System.out.println("Application Started....");
					
					driver.findElementById("com.affluencesystems.admin:id/text_email").sendKeys("haripriyaa@affluencesystems.com");
					driver.findElementById("com.affluencesystems.admin:id/text_user_pass").sendKeys("Aff@1234");
					driver.findElementById("com.affluencesystems.admin:id/text_sign_in").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RadioButton").click();
					
					driver.findElementByXPath("//*[@text='Select']").click();
					if(driver.findElementById("com.affluencesystems.admin:id/middle").isDisplayed())
				    {
				    	System.out.println("Login Successfully");
				    }
				    else
				    {
				    	System.out.println("Login failed");
				    }
					
					//travel details
					
					driver.findElementById("com.affluencesystems.admin:id/week_text").click();
					driver.findElementById("com.affluencesystems.admin:id/month_text").click();
					driver.findElementById("com.affluencesystems.admin:id/today_text").click();
					
					//notifications
					
					driver.findElementById("com.affluencesystems.admin:id/notification_text").click();
					
					Thread.sleep(2000);
					driver.findElementById("com.affluencesystems.admin:id/sp_selection_").click();
					Thread.sleep(2000);
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]").click();
					
					driver.findElementById("com.affluencesystems.admin:id/sp_selection_").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]").click();
					
					driver.findElementById("com.affluencesystems.admin:id/sp_selection_").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]").click();
					driver.findElementById("com.affluencesystems.admin:id/start_date").click();
					driver.findElementById("android:id/date_picker_header_year").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.ScrollView/android.widget.ViewAnimator/android.widget.ListView/android.widget.TextView[7]").click();
					driver.findElementById("com.affluencesystems.admin:id/start_date").click();
					driver.findElementByAccessibilityId("Previous month").click();
					driver.findElementByAccessibilityId("01 July 2020").click();
					driver.findElementById("com.affluencesystems.admin:id/end_date").click();
					driver.findElementById("android:id/date_picker_header_year").click();
					driver.findElementById("android:id/text1").click();
					driver.findElementById("com.affluencesystems.admin:id/end_date").click();
					driver.findElementByAccessibilityId("16 September 2020").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]").click();
					Thread.sleep(8000);
//					driver.findElementByAccessibilityId("Geo Fencing. ").click();
					driver.findElementById("com.affluencesystems.admin:id/cancel_map").click();
					driver.findElementById("com.affluencesystems.admin:id/spinner_type_not").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]").click();
					driver.findElementById("com.affluencesystems.admin:id/spinner_type_not").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]").click();
					driver.findElementById("com.affluencesystems.admin:id/spinner_type_not").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]").click();
					driver.findElementById("com.affluencesystems.admin:id/spinner_type_not").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[5]").click();
					driver.findElementById("com.affluencesystems.admin:id/spinner_type_not").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[6]").click();
					driver.findElementById("com.affluencesystems.admin:id/spinner_type_not").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[7]").click();
					driver.findElementById("com.affluencesystems.admin:id/spinner_type_not").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[8]").click();
					driver.findElementById("com.affluencesystems.admin:id/spinner_type_not").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[9]").click();
					driver.findElementById("com.affluencesystems.admin:id/spinner_type_not").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[10]").click();
					driver.findElementById("com.affluencesystems.admin:id/spinner_type_not").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[11]").click();
					driver.findElementById("com.affluencesystems.admin:id/spinner_type_not").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[12]").click();
					driver.findElementById("com.affluencesystems.admin:id/spinner_type_not").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[13]").click();
					driver.findElementById("com.affluencesystems.admin:id/spinner_type_not").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[14]").click();
					driver.findElementById("com.affluencesystems.admin:id/spinner_type_not").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]").click();
					
					
					driver.findElementById("com.affluencesystems.admin:id/home_image").click();
					driver.findElementById("com.affluencesystems.admin:id/menu_img").click();
					
					//Trip Management
					
					driver.findElementById("com.affluencesystems.admin:id/trip_management_title").click();
					
					driver.findElementById("com.affluencesystems.admin:id/add_trip").click();
					driver.findElementById("com.affluencesystems.admin:id/sp_selection").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]").click();
					driver.findElementById("com.affluencesystems.admin:id/sp_selection").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]").click();
					driver.findElementById("com.affluencesystems.admin:id/relstart").click();
					driver.findElementById("com.affluencesystems.admin:id/relend").click();
					driver.findElementById("com.affluencesystems.admin:id/back_button").click();
					
					driver.findElementById("com.affluencesystems.admin:id/past_trip_layout").click();
					driver.findElementById("com.affluencesystems.admin:id/sp_selection").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]").click();
					driver.findElementById("com.affluencesystems.admin:id/sp_selection").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]").click();
					driver.findElementById("com.affluencesystems.admin:id/sp_selection").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]").click();
					driver.findElementById("com.affluencesystems.admin:id/start_date_layout").click();
					driver.findElementById("android:id/date_picker_header_year").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.ScrollView/android.widget.ViewAnimator/android.widget.ListView/android.widget.TextView[7]").click();
					driver.findElementById("com.affluencesystems.admin:id/start_date").click();
					driver.findElementByAccessibilityId("Previous month").click();
					driver.findElementByAccessibilityId("01 July 2020").click();
					driver.findElementById("com.affluencesystems.admin:id/end_date").click();
					driver.findElementById("android:id/date_picker_header_year").click();
					driver.findElementById("android:id/text1").click();		
					driver.findElementById("com.affluencesystems.admin:id/end_date").click();
					driver.findElementByAccessibilityId("11 September 2020").click();
					driver.findElementById("com.affluencesystems.admin:id/back_button").click();
					driver.findElementById("com.affluencesystems.admin:id/back_button").click();						
					
					//strides 
					
					driver.findElementById("com.affluencesystems.admin:id/strideList").click();
					driver.findElementById("com.affluencesystems.admin:id/sp_selection").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]").click();
					driver.findElementById("com.affluencesystems.admin:id/sp_selection").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]").click();
					driver.findElementById("com.affluencesystems.admin:id/sp_selection").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]").click();
					driver.findElementById("com.affluencesystems.admin:id/start_date").click();
					driver.findElementById("android:id/date_picker_header_year").click();
					driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.ScrollView/android.widget.ViewAnimator/android.widget.ListView/android.widget.TextView[7]").click();
					driver.findElementById("com.affluencesystems.admin:id/start_date").click();
					driver.findElementByAccessibilityId("Previous month").click();
					driver.findElementByAccessibilityId("01 July 2020").click();
					driver.findElementById("com.affluencesystems.admin:id/end_date").click();
					driver.findElementById("android:id/date_picker_header_year").click();
					driver.findElementById("android:id/text1").click();		
					driver.findElementById("com.affluencesystems.admin:id/end_date").click();
					driver.findElementByAccessibilityId("11 September 2020").click();				
					driver.findElementById("com.affluencesystems.admin:id/back_button").click();						
					
					//servicing list 
					
					driver.findElementById("com.affluencesystems.admin:id/services_cardView").click();
					
					driver.findElementById("com.affluencesystems.admin:id/floating_action_text1").click();

					
					driver.findElementById("com.affluencesystems.admin:id/lastservicelayout").click();


			driver.findElementById("android:id/date_picker_header_year").click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.ScrollView/android.widget.ViewAnimator/android.widget.ListView/android.widget.TextView[7]").click();
			driver.findElementByAccessibilityId("Previous month").click();
			driver.findElementByAccessibilityId("14 August 2020").click();
			driver.findElementById("android:id/button1").click();
			driver.findElementById("com.affluencesystems.admin:id/et_amount").sendKeys("2000");
			driver.findElementById("com.affluencesystems.admin:id/et_odometer_reading").sendKeys("200");
			driver.findElementById("com.affluencesystems.admin:id/et_next_service").click();
			driver.findElementByAccessibilityId("Next month").click();
			driver.findElementByAccessibilityId("23 October 2020").click();
			driver.findElementById("android:id/button1").click();
			driver.findElementById("com.affluencesystems.admin:id/et_next_service_km").sendKeys("500");
			driver.findElementById("com.affluencesystems.admin:id/et_description").sendKeys("service");
			//driver.findElementById("com.affluencesystems.admin:id/im_doc").click();
			//driver.findElementById("android:id/button1").click();
			//driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
			//driver.findElementById("android:id/button1").click();
			//driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[1]\r\n").click();
			//driver.findElementByAccessibilityId("Shutter button").click();
			//driver.findElementByAccessibilityId("Done").click();
			driver.findElementById("com.affluencesystems.admin:id/im_doc").click();
			driver.findElementById("android:id/button1").click();
			Thread.sleep(2000);
			driver.findElementById("com.android.camera2:id/shutter_button").click();
			Thread.sleep(3000);
			driver.findElementById("com.android.camera2:id/done_button").click();
	
			Thread.sleep(2000);
			driver.findElementById("com.affluencesystems.admin:id/submit").click();
			Thread.sleep(2000);

			if(driver.findElementByXPath("//*[@text='service']").isDisplayed())
			{
				System.out.println("New service added successfully");
			}else
			{
				System.out.println("New service creation failed");

			}
					Thread.sleep(2000);
					driver.findElementByXPath("//*[@text='service']").click();
					driver.findElementById("com.affluencesystems.admin:id/search_bar").click();
					driver.findElementById("android:id/button1").click();
					Thread.sleep(2000);
			driver.findElementById("com.affluencesystems.admin:id/back_button").click();	
			
			//DTC Errors
					
			driver.findElementById("com.affluencesystems.admin:id/dtc_card").click();	
			driver.findElementById("com.affluencesystems.admin:id/sp_selection").click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]").click();
			driver.findElementById("com.affluencesystems.admin:id/sp_selection").click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]").click();
			driver.findElementById("com.affluencesystems.admin:id/sp_selection").click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]").click();
			driver.findElementById("com.affluencesystems.admin:id/start_date").click();
			driver.findElementById("android:id/date_picker_header_year").click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.ScrollView/android.widget.ViewAnimator/android.widget.ListView/android.widget.TextView[7]").click();
			driver.findElementById("com.affluencesystems.admin:id/start_date").click();
			driver.findElementByAccessibilityId("Previous month").click();
			driver.findElementByAccessibilityId("01 August 2020").click();
			driver.findElementById("com.affluencesystems.admin:id/end_date").click();
			driver.findElementById("android:id/date_picker_header_year").click();
			driver.findElementById("android:id/text1").click();		

			driver.findElementById("com.affluencesystems.admin:id/end_date").click();
			driver.findElementByAccessibilityId("11 September 2020").click();				
			driver.findElementById("com.affluencesystems.admin:id/back_button").click();
			
			
			//reports 
					
					driver.findElement(MobileBy.AndroidUIAutomator(
					        "new UiScrollable(new UiSelector().scrollable(true))" +
					         ".scrollIntoView(new UiSelector().resourceIdMatches(\"com.affluencesystems.admin:id/settings_card\"))"));
//			driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
			driver.findElementById("com.affluencesystems.admin:id/reports").click();
			driver.findElementById("com.affluencesystems.admin:id/sp_selection").click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]").click();
			driver.findElementById("com.affluencesystems.admin:id/sp_selection").click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]").click();
			driver.findElementById("com.affluencesystems.admin:id/sp_selection").click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]").click();
			driver.findElementById("com.affluencesystems.admin:id/start_date").click();
			driver.findElementById("android:id/date_picker_header_year").click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.ScrollView/android.widget.ViewAnimator/android.widget.ListView/android.widget.TextView[7]").click();
			driver.findElementById("com.affluencesystems.admin:id/start_date").click();
			driver.findElementByAccessibilityId("Previous month").click();
			driver.findElementByAccessibilityId("01 July 2020").click();
			driver.findElementById("com.affluencesystems.admin:id/end_date").click();
			driver.findElementById("android:id/date_picker_header_year").click();
			driver.findElementById("android:id/text1").click();		
			driver.findElementById("com.affluencesystems.admin:id/end_date").click();
			driver.findElementByAccessibilityId("16 September 2020").click();				
			driver.findElementById("com.affluencesystems.admin:id/back_button").click();
			
			//settings
			
			driver.findElementById("com.affluencesystems.admin:id/settings_card").click();
			driver.findElementById("com.affluencesystems.admin:id/card_config").click();
			driver.findElementById("com.affluencesystems.admin:id/no_of_fences").click();
			driver.findElementById("com.affluencesystems.admin:id/floating_action_text_add").click();
			Thread.sleep(8000);
			driver.findElementById("com.affluencesystems.admin:id/create").click();
			driver.findElementById("com.affluencesystems.admin:id/map").click();
			Location location = new Location(17.291032, 78.605287, 0);
			driver.setLocation(location);
			Thread.sleep(2000);
			driver.findElementById("com.affluencesystems.admin:id/done").click();
			driver.findElementById("com.affluencesystems.admin:id/et_fence_name").sendKeys("fence100");
			driver.findElementById("com.affluencesystems.admin:id/radius").sendKeys("10");
			driver.findElementById("com.affluencesystems.admin:id/ok").click();
			if(driver.findElementByXPath("//*[@text='fence100']").isDisplayed())
			{
				System.out.println("New Radius Geofence added successfully");
			}else
			{
				System.out.println("New Radius Gencefence creation failed");

			}
			Thread.sleep(2000);
			driver.findElementByXPath("//*[@text='fence100']").click();
			Thread.sleep(3000);
			driver.findElementById("com.affluencesystems.admin:id/delete_fence").click();
			driver.findElementById("android:id/button1").click();
			driver.findElementById("com.affluencesystems.admin:id/back_button").click();
			Thread.sleep(3000);
			driver.findElementById("com.affluencesystems.admin:id/back_button").click();
			
			driver.findElementById("com.affluencesystems.admin:id/notifications_settings").click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.Switch").click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.Switch").click();
			driver.findElementById("com.affluencesystems.admin:id/submit").click();
			Thread.sleep(2000);
			driver.findElementById("com.affluencesystems.admin:id/back_button").click();

		//feedback
			
			driver.findElementById("com.affluencesystems.admin:id/feedback").click();
			driver.findElementById("com.affluencesystems.admin:id/rating_bar").click();
			driver.findElementById("com.affluencesystems.admin:id/rating_bar").sendKeys("4");
			driver.findElementById("com.affluencesystems.admin:id/tv_description").sendKeys("excellent");
			Thread.sleep(2000);
			driver.findElementById("com.affluencesystems.admin:id/submit").click();
			Thread.sleep(2000);
			driver.findElementById("com.affluencesystems.admin:id/issue_type").click();
			Thread.sleep(2000);
			driver.findElementById("com.affluencesystems.admin:id/tv_description").sendKeys("Login Issue");
			Thread.sleep(2000);
			driver.findElementById("com.affluencesystems.admin:id/submit").click();
			Thread.sleep(2000);
			driver.findElementById("com.affluencesystems.admin:id/back_button").click();
			
			//profile
			
			driver.findElementById("com.affluencesystems.admin:id/edit_profile").click();
			driver.findElementById("com.affluencesystems.admin:id/editmob").click();
			driver.findElementById("com.affluencesystems.admin:id/editmob").click();
			driver.findElementById("com.affluencesystems.admin:id/editemail").click();
			driver.findElementById("com.affluencesystems.admin:id/editemail").click();
			driver.findElementById("com.affluencesystems.admin:id/text_update").click();
			Thread.sleep(2000);
			
			driver.findElementById("com.affluencesystems.admin:id/edit_profile").click();
			driver.findElementById("com.affluencesystems.admin:id/reset_pass1").click();
			driver.findElementById("com.affluencesystems.admin:id/im_pass_hide").click();
			driver.findElementById("com.affluencesystems.admin:id/update_pwd").click();
			Thread.sleep(2000);
			driver.findElementById("com.affluencesystems.admin:id/back_button").click();
			Thread.sleep(2000);
			driver.findElementById("com.affluencesystems.admin:id/back_button").click();
			
			//vehicle management
			driver.findElement(MobileBy.AndroidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true))" +
			         ".scrollIntoView(new UiSelector().resourceIdMatches(\"com.affluencesystems.admin:id/trip_management_title\"))"));

			driver.findElementById("com.affluencesystems.admin:id/vehicle_number_state").click();
			driver.findElementById("com.affluencesystems.admin:id/floating_action_text").click();
//			driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
			driver.findElement(MobileBy.AndroidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true))" +
			         ".scrollIntoView(new UiSelector().resourceIdMatches(\"com.affluencesystems.admin:id/text_sign_up\"))"));

			driver.findElementById("com.affluencesystems.admin:id/text_sign_up").click();
			driver.findElementById("com.affluencesystems.admin:id/back_button").click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]").click();
			
			driver.findElementById("com.affluencesystems.admin:id/track_veh_layout").click();
			driver.findElementById("com.affluencesystems.admin:id/zoom_enable").click();
			driver.findElementById("com.affluencesystems.admin:id/style_card").click();
			Thread.sleep(2000);
			driver.findElementById("com.affluencesystems.admin:id/lv_satellite").click();
			Thread.sleep(2000);
			driver.findElementById("com.affluencesystems.admin:id/tv_view").click();
			Thread.sleep(2000);
			driver.findElementById("com.affluencesystems.admin:id/back_button").click();
			
			driver.findElementById("com.affluencesystems.admin:id/trip_count_layout").click();
			driver.findElementById("com.affluencesystems.admin:id/sp_selection").click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]").click();
			driver.findElementById("com.affluencesystems.admin:id/sp_selection").click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]").click();
			driver.findElementById("com.affluencesystems.admin:id/sp_selection").click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]").click();
			driver.findElementById("com.affluencesystems.admin:id/start_date").click();
			driver.findElementById("android:id/date_picker_header_year").click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.ScrollView/android.widget.ViewAnimator/android.widget.ListView/android.widget.TextView[7]").click();
			driver.findElementById("com.affluencesystems.admin:id/start_date").click();
			driver.findElementByAccessibilityId("Previous month").click();
			driver.findElementByAccessibilityId("01 July 2020").click();
			driver.findElementById("com.affluencesystems.admin:id/end_date").click();
			driver.findElementById("android:id/date_picker_header_year").click();
			driver.findElementById("android:id/text1").click();		
			driver.findElementById("com.affluencesystems.admin:id/end_date").click();
			driver.findElementByAccessibilityId("16 September 2020").click();				
			driver.findElementById("com.affluencesystems.admin:id/back_button").click();
			
			driver.findElementById("com.affluencesystems.admin:id/dtc_count_layout").click();
			driver.findElementById("com.affluencesystems.admin:id/sp_selection").click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]").click();
			driver.findElementById("com.affluencesystems.admin:id/sp_selection").click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]").click();
			driver.findElementById("com.affluencesystems.admin:id/sp_selection").click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]").click();
			driver.findElementById("com.affluencesystems.admin:id/start_date").click();
			driver.findElementById("android:id/date_picker_header_year").click();
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.ScrollView/android.widget.ViewAnimator/android.widget.ListView/android.widget.TextView[7]").click();
			driver.findElementById("com.affluencesystems.admin:id/start_date").click();
			driver.findElementByAccessibilityId("Previous month").click();
			driver.findElementByAccessibilityId("01 August 2020").click();
			driver.findElementById("com.affluencesystems.admin:id/end_date").click();
			driver.findElementById("android:id/date_picker_header_year").click();
			driver.findElementById("android:id/text1").click();		
			driver.findElementById("com.affluencesystems.admin:id/end_date").click();
			driver.findElementByAccessibilityId("16 September 2020").click();				
			driver.findElementById("com.affluencesystems.admin:id/back_button").click();
			
			driver.findElementById("com.affluencesystems.admin:id/fence_count_layout").click();
			driver.findElementById("com.affluencesystems.admin:id/no_of_fences").click();
			driver.findElementById("com.affluencesystems.admin:id/floating_action_text_add").click();
			Thread.sleep(7000);
			driver.findElementById("com.affluencesystems.admin:id/create").click();
			driver.findElementById("com.affluencesystems.admin:id/map").click();
			Location location2 = new Location(17.291032, 78.605287, 0);
			driver.setLocation(location2);
			Thread.sleep(2000);
			driver.findElementById("com.affluencesystems.admin:id/done").click();
			driver.findElementById("com.affluencesystems.admin:id/et_fence_name").sendKeys("fence101");
			driver.findElementById("com.affluencesystems.admin:id/radius").sendKeys("10");
			driver.findElementById("com.affluencesystems.admin:id/ok").click();
			if(driver.findElementByXPath("//*[@text='fence101']").isDisplayed())
			{
				System.out.println("New Radius Geofence added successfully");
			}else
			{
				System.out.println("New Radius Gencefence creation failed");

			}
			Thread.sleep(2000);
			driver.findElementByXPath("//*[@text='fence101']").click();
			Thread.sleep(3000);
			driver.findElementById("com.affluencesystems.admin:id/delete_fence").click();
			Thread.sleep(2000);
			driver.findElementById("android:id/button1").click();
			Thread.sleep(2000);
			driver.findElementById("com.affluencesystems.admin:id/back_button").click();
//			driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
			driver.findElement(MobileBy.AndroidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true))" +
			         ".scrollIntoView(new UiSelector().resourceIdMatches(\"com.affluencesystems.admin:id/text_update\"))"));
			driver.findElementById("com.affluencesystems.admin:id/text_update").click();
			
			driver.findElementById("com.affluencesystems.admin:id/service_count_layout").click();
			driver.findElementById("com.affluencesystems.admin:id/floating_action_text1").click();

			Thread.sleep(2000);
			driver.findElementById("com.affluencesystems.admin:id/lastservicelayout").click();


	driver.findElementById("android:id/date_picker_header_year").click();
	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.ScrollView/android.widget.ViewAnimator/android.widget.ListView/android.widget.TextView[7]").click();
	driver.findElementByAccessibilityId("Previous month").click();
	driver.findElementByAccessibilityId("14 August 2020").click();
	driver.findElementById("android:id/button1").click();
	driver.findElementById("com.affluencesystems.admin:id/et_amount").sendKeys("2000");
	driver.findElementById("com.affluencesystems.admin:id/et_odometer_reading").sendKeys("200");
	driver.findElementById("com.affluencesystems.admin:id/et_next_service").click();
	driver.findElementByAccessibilityId("Next month").click();
	driver.findElementByAccessibilityId("23 October 2020").click();
	driver.findElementById("android:id/button1").click();
	driver.findElementById("com.affluencesystems.admin:id/et_next_service_km").sendKeys("500");
	driver.findElementById("com.affluencesystems.admin:id/et_description").sendKeys("service14");
	driver.findElementById("com.affluencesystems.admin:id/im_doc").click();
	Thread.sleep(2000);
	driver.findElementById("android:id/button1").click();
	Thread.sleep(2000);
	driver.findElementById("com.android.camera2:id/shutter_button").click();
	Thread.sleep(3000);
	driver.findElementById("com.android.camera2:id/done_button").click();

	Thread.sleep(2000);
	driver.findElementById("com.affluencesystems.admin:id/submit").click();
	Thread.sleep(2000);

	if(driver.findElementByXPath("//*[@text='service14']").isDisplayed())
	{
		System.out.println("New service added successfully");
	}else
	{
		System.out.println("New service creation failed");

	}
	Thread.sleep(2000);
	driver.findElementByXPath("//*[@text='service14']").click();
	Thread.sleep(2000);
	driver.findElementById("com.affluencesystems.admin:id/search_bar").click();
	Thread.sleep(2000);
	driver.findElementById("android:id/button1").click();
	driver.findElementById("com.affluencesystems.admin:id/back_button").click();
	
	driver.findElementById("com.affluencesystems.admin:id/delete_fence").click();
	Thread.sleep(2000);
	driver.findElementById("android:id/button2").click();
	driver.findElementById("com.affluencesystems.admin:id/back_button").click();
	driver.findElementById("com.affluencesystems.admin:id/submit").click();
	Thread.sleep(2000);
	
	
	//logout 
	
	driver.findElementById("com.affluencesystems.admin:id/logout_rl").click();
	Thread.sleep(2000);
	driver.findElementById("android:id/button1").click();
	
	Thread.sleep(2000);
	driver.close();
			
			
						
	}
	
}
