package tests;

import Utils.Browser;
import Utils.Utils;
import elementMapper.MyAccountPageElementMapper;
import org.junit.Test;
import pageObjects.MyAccountPage;


import static org.junit.Assert.assertTrue;

public class SetupTest extends BaseTests{

    @Test
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador e carregamos a URL");
    }

}
