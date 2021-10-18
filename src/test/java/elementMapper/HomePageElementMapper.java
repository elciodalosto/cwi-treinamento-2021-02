package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElementMapper {


    /* TOP BANNER */
    @FindBy(xpath = "//*[@id='page']/div/header/div/div/div/a/img")
    public WebElement bannerTop;

    /* TOP NAVBAR */
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    public WebElement signInBtn;

    @FindBy(id = "contact-link")
    public WebElement contactUsBtn;



}
