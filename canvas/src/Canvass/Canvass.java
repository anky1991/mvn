package Canvass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Canvass 
{
	public static void main(String[] args)
	{
		/*System.setProperty("webdriver.chrome.driver", "/home/local/MPROG/ankit.sharma/Downloads/chromedriver");
		WebDriver dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		dr.get("https://www.redbus.in/search?fromCityName=New%20Delhi&toCityName=Kanpur&fromCityId=733&toCityId=1377&busType=Any&opId=0&onward=06-Sep-2019&return=07-Sep-2019");
		JavascriptExecutor js=(JavascriptExecutor) dr;
		js.executeScript("window.scrollBy(0,450)");
		dr.findElement(By.xpath("(//div[text()='View Seats'])[1]")).click();
		js.executeScript("window.scrollBy(0,500)");
		Actions as =new Actions(dr);
		as.moveByOffset(490, 201).click().build().perform();
		as.clickAndHold(dr.findElement(By.xpath("(//canvas)[1]"))).moveByOffset(0, 60).
		moveByOffset(50,10).
		moveByOffset(-10,-50).
		moveByOffset(-50,-10).release().perform();*/
		
      String s="i am boy";
      char [] c=s.toCharArray();
      for(int i=c.length-1;i>=0;i--)
      {
    	  System.out.print(i);
      }
      
	}
}

