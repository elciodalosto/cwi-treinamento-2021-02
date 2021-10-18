package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElementMapper {
    /* significado dos sufixos
        Field == Campo de texto
        Btn == Botão
        Link == Texto com hiperlink
    */

    /* LOGIN */
    @FindBy(id = "email")
    public WebElement emailLoginField;

    @FindBy(id = "SubmitLogin")
    public WebElement submitLoginBtn;

    @FindBy(id = "passwd")
    public WebElement passwordLoginField;


    /* CRIAÇÃO DE CONTA */
    @FindBy(id = "SubmitCreate")
    public WebElement submitCreateAccountBtn;

    @FindBy(id = "email_create")
    public WebElement emailCreateField;

    @FindBy(className = "lost_password form-group")
    public WebElement forgotPasswordLink;


    /* RECUPERAÇÃO DE CONTA */
    @FindBy(xpath = "//*[@id=\"form_forgotpassword\"]/fieldset/div[1]/input")
    public WebElement emailRecoverAccountField;

    @FindBy(xpath = "//*[@id=\"form_forgotpassword\"]/fieldset/p")
    public WebElement submitRecoverPasswordBtn;

}
