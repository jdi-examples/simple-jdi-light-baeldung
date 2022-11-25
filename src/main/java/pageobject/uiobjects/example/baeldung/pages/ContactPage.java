package pageobject.uiobjects.example.baeldung.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.ByText;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.WithText;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextArea;
import com.epam.jdi.light.ui.html.elements.common.TextField;

@Url("/contact") @Title("ContactInfo Me | Baeldung")
public class ContactPage extends WebPage {
    @UI("[name=your-name]") TextField firstName;
    @UI("[name=your-email]") TextField email;
    @UI("[name=your-message]") TextArea message;

    @UI("input[type='submit']") Button send;
}
