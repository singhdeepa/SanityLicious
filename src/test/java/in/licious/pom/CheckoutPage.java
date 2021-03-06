package in.licious.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BasePage {

	@FindBy(xpath="//button[.='Checkout']")
	private WebElement checkoutbtn;
	
	//@FindBy(xpath="//div[@class='search-cart']/a[@href='https://web.licious.info/user/checkout']")
	@FindBy(xpath="//img[@class='cart-loaded']")
	private WebElement cartBtn;
	
	
	public CheckoutPage(WebDriver driver){
		
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCheckoutBtn(){
		return checkoutbtn;
	}
	
	public WebElement getcartBtn() {
		return cartBtn;
	}
}
