package fewpageobjects.tests;

import fewpageobjects.TestsInit;
import org.testng.annotations.Test;
import pageobject.uiobjects.example.baeldung.entities.Contact;

import static pageobject.uiobjects.example.baeldung.BaeldungSite.contactPage;

public class ContactsExample implements TestsInit {
    Contact MY_CONTACT = new Contact().set(c -> {
        c.firstName = "Roman";
        c.email = "roman.iovlev.jdi@gmail.com";
        c.message = "Hi Baeldung!";} );

    @Test
    public void fillContactTest() {
        contactPage.open();
        contactPage.asForm().send(MY_CONTACT);
    }
}
