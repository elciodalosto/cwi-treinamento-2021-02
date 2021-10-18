package pageObjects;

import Utils.Browser;
import elementMapper.HomePageElementMapper;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends HomePageElementMapper {

    public HomePage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clicaBotaoSignIn(){
        signInBtn.click();
    }
    public void clicaBotaoContactUs(){
        contactUsBtn.click();
    }
    public void clicaBannerTop(){
        bannerTop.click();
    }

    public void clicaCampoSearch(){

    }
    public void clicaLupaCampoSearch(){

    }
    public void clicaCart(){

    }
    public String clicaNavbarMenu(){

    }

}
