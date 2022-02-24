package pageObjects;

import org.openqa.selenium.By;

public class ResultsPage extends BaseClass{
	private static final By showMore = By.xpath("//a[@class='see-more-or-less pull-right']");

    private static final By LawReport = By.xpath("//*[@id=\"refineByTool\"]/div[2]/ul/li[11]/a");
    
    public void clickShowMore()
    {
    	getElement(showMore).click();
    	
    }
    
    public void clicklawReport()
    {
    	getElement(LawReport).click();
    	
    }
}
