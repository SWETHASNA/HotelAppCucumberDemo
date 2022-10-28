package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel {

	 
	 public SearchHotel(WebDriver driver2) {
			// TODO Auto-generated constructor stub
		   PageFactory.initElements(driver2,this);
			   
		}
			
		
	 
	 
	   @FindBy (id = "location")
			   WebElement loc;
	   
//	   @FindBy (id = "hotels")
//	   WebElement hotl;
	   
	   @FindBy( id ="Submit")
	   WebElement submit;
//	   By roomtype=By.cssSelector("room_type");
//	   By roomNumber=By.cssSelector("room_nos");
//	   By roomAdult=By.cssSelector("adult_room");
//	   By roomChild=By.cssSelector("child_room");
//	   By but=By.className("reg_button");
	   
	  
		public void location()
		   {

	         new Select(loc).selectByVisibleText("Melbourne");
		   }
		
		  
//		   public void roomty()
//		   {
//			   new Select(driver2.findElement(By.cssSelector("#room_type"))).selectByIndex(1);
//		   }
//		   public void rommnum()
//		   {
//			   new Select(driver2.findElement(By.cssSelector("#room_nos"))).selectByIndex(3);
//		   }
//		   public void roomadlt()
//		   {
//			   new Select(driver2.findElement(By.cssSelector("#adult_room"))).selectByIndex(1);
//		   }
//		   
//		   public void roomchld()
//		   {
//			   new Select(driver.findElement(By.cssSelector("#child_room"))).selectByIndex(2);
//		   }
		   public void but()
		   {
			  submit.click();
		   }
		   
}

