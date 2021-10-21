package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.BaseClass;

public class Hooks extends BaseClass {

   @Before
    public void startBrowser(){
       openBrowser();
   }

   @After
    public void closeBrowser(){
       tearDown();
   }
}
