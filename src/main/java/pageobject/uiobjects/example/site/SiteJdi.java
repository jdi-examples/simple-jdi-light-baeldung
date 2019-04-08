package pageobject.uiobjects.example.site;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import pageobject.uiobjects.example.site.pages.HomePage;

@JSite("http://www.baeldung.com/")
public class SiteJdi {
    @Url("/") @Title("Baeldung | Java, Spring and Web Development tutorials")
    public static HomePage homePage;
}
