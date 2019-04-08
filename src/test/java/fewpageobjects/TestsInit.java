package fewpageobjects;

import org.testng.annotations.BeforeSuite;
import pageobject.uiobjects.example.baeldung.BaeldungSite;
import pageobject.uiobjects.example.site.SiteJdi;

import static com.epam.jdi.light.ui.html.PageFactory.initElements;
import static pageobject.uiobjects.example.baeldung.BaeldungSite.homePage;

public interface TestsInit {
    @BeforeSuite(alwaysRun = true)
    static void setUp() {
        initElements(BaeldungSite.class);
        homePage.open();
    }
}
