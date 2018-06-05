package in.licious.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewDeliverySummaryPage extends BasePage{

	@FindBy(xpath="//button[.=' Proceed to Payment']")
	private WebElement proceedToPaymentBtn;
	
	@FindBy(xpath="//div[contains(@class,'slots-selector')]")
	private WebElement selectDeliverySlot;
	
	@FindBy(xpath="//ul[@class='slot-time']/li")
	private WebElement selectTimeSlot;
	
	@FindBy(xpath="//div[@class='li-page-body delivery-summary']")
	private WebElement switchtonewframe;
	
	public NewDeliverySummaryPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getProceedToPaymentBtn(){
		return proceedToPaymentBtn;
	}
	
	public WebElement getSelectDeliverySlot(){
		return selectDeliverySlot;
	}
	
	public WebElement getTimeSlot(){
		return selectTimeSlot;
	}
	
	public WebElement getSwitchtoDeliverySummary(){
		return switchtonewframe;
	}
}