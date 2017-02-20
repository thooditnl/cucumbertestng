package org.cucumbertestng.com.cucumbertestng.runners;

/**
 * Created by THOODI on 1/13/2017.
 */
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/features/Download.feature",
        glue = "org.cucumbertestng.com.cucumbertestng.glue",
        format = {"pretty"})
public class DownloadFeatureRunner extends AbstractTestNGCucumberTests {
}
