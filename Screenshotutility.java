package ScreenshotUtility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import BaseLibrary.BaseLibrary;

public class Screenshotutility extends BaseLibrary
{
	public static void getscreenshot(String foldername,String filename)
	{
		String location =System.getProperty("user.dir");
		try
		{
			String path=location+"\\Screenshot\\"+foldername+"\\"+filename+".png";
			EventFiringWebDriver efw=new EventFiringWebDriver(driver);
			File src=efw.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(path));
					
		} catch (Exception e) {
			System.out.println("Issue in getscreenshot "+e);
		}
	}
}
