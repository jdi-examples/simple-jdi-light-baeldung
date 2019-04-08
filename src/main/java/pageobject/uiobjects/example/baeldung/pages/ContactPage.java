package pageobject.uiobjects.example.baeldung.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.ui.html.common.Button;
import com.epam.jdi.light.ui.html.common.TextArea;
import com.epam.jdi.light.ui.html.common.TextField;

@Url("/contact") @Title("Contact Me | Baeldung")
public class ContactPage extends WebPage {
    @FindBy(css = "[name=first_name]") TextField firstName;
    @FindBy(css = "[name=email]") TextField email;
    @FindBy(css = "[name=message]") TextArea message;
    @FindBy(xpath = "//*[text()='Send Your Message']") Button send;
}
