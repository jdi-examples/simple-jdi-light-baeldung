package pageobject.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.WithText;
import com.epam.jdi.light.ui.html.elements.common.Link;

public class HomePage extends WebPage {
    @UI(".menu-about a") public static Link menuAbout;
    @UI("//h3[contains(.,'About Baeldung')]")
    public static Link aboutBaeldung;
}
