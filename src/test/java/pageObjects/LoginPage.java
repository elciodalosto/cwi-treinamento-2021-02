package pageObjects;

import Utils.Browser;
import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    /* MÉTODOS PÁGINA DE LOGIN */
    public void preencheEmailLogin(){
        emailLoginField.sendKeys("fakemail@fakemail.com");
    }
    public void preencheSenhaLogin(){
        passwordLoginField.sendKeys("fakepass");
    }
    public void clicaBotaoLoginSubmit(){
        submitLoginBtn.click();
    }
    public void clicaForgotPasswordLink(){

    }


    /* MÉTODOS PÁGINA CRIAÇÃO DE CONTA */
    public void preencheEmailCriarConta(){
        emailCreateField.click();
    }
    public void clicaBotaoSubmitCriarConta(){
        submitCreateAccountBtn.click();
    }
}
