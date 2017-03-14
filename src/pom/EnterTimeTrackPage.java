package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import generic.BasePage;

public class EnterTimeTrackPage extends BasePage {
	
@FindBy(className="logout")
private WebElement logoutLink;

@FindBy(xpath="//span[text()='Help & Support")
private WebElement help;

@FindBy(linkText="About actiTIME")
private WebElement aboutActiTIME;

@FindBy(xpath="//span[contains(.='build')]")
private WebElement buildNum;

@FindBy(xpath="//img[@title='class']")
private WebElement close;

public EnterTimeTrackPage(WebDriver driver)
{
	super(driver);
}

public void clickLogout()
{
	logoutLink.click();
}

public void clickHelp()
{
	help.click();
}

public void clickAboutActiTime()
{
	aboutActiTIME.click();
}

public void verifyBuildNumber(String eBuildNumber)
{
	String aBuildNumber=buildNum.getText();
	Assert.assertEquals(aBuildNumber,eBuildNumber);
}
public void clickClose()
{
	close.click();
}
public void verifyEnterTimeTrackPageIsDisplayed()
{
	verifyTitle("actiTIME - Enter Time-Track");
}

}
