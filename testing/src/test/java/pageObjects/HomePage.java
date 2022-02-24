package pageObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseClass {

	private static final String URL = "https://www.xperthr.co.uk/";
	private static final By accept_Cokies=By.xpath("//button[@id='onetrust-accept-btn-handler']");
	private static final By header = By.xpath("//xhr-header-component");
	private static final By searchBox = By.id("search");
	private static final By searchButton = By.xpath("//*[@id=\"search\"]\button");

    private static final By shpwMore = By.xpath("//*[@class=\"see-more-or-less pull-right\"]");

    private static final By LawReport = By.partialLinkText("Law reports");
   
    public void launchApp() {
        launchURL(URL);
    }
    public void enterSearchdetails(String searchedKeyWord) throws InterruptedException
    {
    	getElement(accept_Cokies).click();
    	waitForElementVisibility(header);
    	WebElement root1 = driver.findElement(By.xpath("//xhr-header-component"));
    	SearchContext shadowRoot1 = root1.getShadowRoot();
    	WebElement shadowContent = shadowRoot1.findElement(By.cssSelector("header>full-header>div>div>div>div>div>xhr-search-field"));
    	waitForElementVisibility(header);
    	SearchContext shadowContent2=shadowContent.getShadowRoot();
    	WebElement shadowcontent3=shadowContent2.findElement(By.cssSelector("div>xhr-search"));
    	SearchContext shadowContent4=shadowcontent3.getShadowRoot();
    	WebElement shadowcontent5=shadowContent4.findElement(By.cssSelector("div>div>input"));
    	shadowcontent5.sendKeys(searchedKeyWord);
    	
    	
    }
    public void clickSearchButton()
    {
    	WebElement root1 = driver.findElement(By.xpath("//xhr-header-component"));
    	SearchContext shadowRoot1 = root1.getShadowRoot();
    	WebElement shadowContent = shadowRoot1.findElement(By.cssSelector("header>full-header>div>div>div>div>div>xhr-search-field"));
    	waitForElementVisibility(header);
    	SearchContext shadowContent2=shadowContent.getShadowRoot();
    	WebElement shadowcontent3=shadowContent2.findElement(By.cssSelector("div>xhr-search"));
    	SearchContext shadowContent4=shadowcontent3.getShadowRoot();
    	WebElement shadowcontent5=shadowContent4.findElement(By.cssSelector("div>div>button"));
    	shadowcontent5.click();
    }

}


