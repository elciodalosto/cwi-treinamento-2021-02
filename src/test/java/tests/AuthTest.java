package tests;

import org.junit.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class AuthTest extends BaseTests{

    /* TESTES DE AUTENTICAÇÃO */
    @Test
    public void testLogin(){
        HomePage myaccount = new HomePage();
        LoginPage login = new LoginPage();

        myaccount.clicaBotaoSignIn();
        login.preencheEmailLogin();
        login.preencheSenhaLogin();
        login.clicaBotaoLoginSubmit();
    }

    @Test
    public void testRegister(){

    }
    @Test
    public void testLogout(){

    }


}
