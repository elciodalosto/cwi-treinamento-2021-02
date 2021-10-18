package tests;

import org.junit.After;
import org.junit.Before;
import Utils.Browser;
import Utils.Utils;

import java.util.concurrent.TimeUnit;

public class BaseTests {

    @Before
    public void setup(){
        Browser.loadPage(Utils.getBaseUrl());
    }

//    @After
    public void tearDown(){
        Browser.close();
    }
}
