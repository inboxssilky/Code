package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class welcomePage {
	WebDriverWait wait;
	WebDriver dr;
	
	@FindBy(css="[data-pageid= '00000000-0000-0000-0000-000000247216']")
	WebElement welcome;
	
	@FindBy(xpath="//*[text()='Herbal Tea']")
	WebElement herbalTea;
	
	
	public welcomePage(WebDriver dr){
		this.dr=dr;
		PageFactory.initElements(dr,this);
	}

	public String getText(){
	return	dr.getTitle();
	}
	public String getTextHerbalTea(){
		wait = new WebDriverWait(dr, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Herbal Tea']")));
		return	herbalTea.getText();
		}
	
		}	
