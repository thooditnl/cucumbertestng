package org.cucumbertestng.com.cucumbertestng.page.objects;

/**
 * Created by THOODI on 1/13/2017.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.cucumbertestng.com.cucumbertestng.framework.ParentPage;

public class DownloadPage extends ParentPage {

    private static final String DOWNLOAD_LINK = "//div[@id='mainContent']//table[1]//tbody//td[text()='%s']//..//td[4]//a[text()='Download']";

    public DownloadPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasDownloadLinkFor(String linkText) {
        By downloadLinkLocator = By.xpath(String.format(DOWNLOAD_LINK, linkText));
        return hasElement(downloadLinkLocator);
    }

}
