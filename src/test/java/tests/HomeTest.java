package tests;

import org.junit.Test;
import pageObjects.HomePage;

public class HomeTest extends BaseTests{

    @Test
    public void testAcessarPaginaDeContato(){
        HomePage home = new HomePage();
        home.clicaBotaoContactUs();
    }


}
