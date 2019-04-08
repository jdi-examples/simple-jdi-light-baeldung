package pageobject.tests;

import pageobject.TestsInit;
import org.testng.annotations.Test;

import static pageobject.uiobjects.example.site.SiteJdi.*;

public class PageObjectExample implements TestsInit {
    @Test
    public void openPage() {
        homePage.open();
        homePage.checkOpened();
        homePage.shouldBeOpened();
    }
}
