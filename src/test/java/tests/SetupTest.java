package tests;

import Utils.Browser;
import Utils.Utils;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class SetupTest extends BaseTests{

    @Test
    public void testOpeningBrowserAndLoadingPage(){
        boolean baseUrl = Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl());
        assertTrue(baseUrl);
//        System.out.println("Abrimos o navegador e carregamos a URL");
    }

    @Test
    public void testLogin(){
        Browser.getCurrentDriver().findElement(By.className("login")).click();
//        System.out.println("click login");
        boolean caminhoPaginaDeLogin = Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account"));
        assertTrue(caminhoPaginaDeLogin);
        Browser.getCurrentDriver().findElement(By.id("email")).sendKeys("fakemail@fakemail.com");
        Browser.getCurrentDriver().findElement(By.id("passwd")).sendKeys("fakepass");
        Browser.getCurrentDriver().findElement(By.id("SubmitLogin")).click();
        boolean caminhoPaginaAutenticado = Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=my-account"));
        assertTrue(caminhoPaginaAutenticado);
        boolean textoPageHeading = Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT");
        assertTrue(textoPageHeading);
    }
}
