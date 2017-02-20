package org.cucumbertestng.com.cucumbertestng.page.objects;

/**
 * Created by THOODI on 1/13/2017.
 */

import org.openqa.selenium.WebDriver;
import org.cucumbertestng.com.cucumbertestng.framework.ParentPage;

public class MainPage extends ParentPage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickTab(String tab) {
        click(tab);
    }

}
