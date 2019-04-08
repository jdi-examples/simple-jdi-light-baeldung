package nopageobjects.tests;

import com.epam.jdi.light.elements.composite.WebPage;
import org.testng.annotations.Test;

public class JDILightExample {
    @Test
    public void openPage() {
        WebPage.openUrl("http://www.baeldung.com/");
    }

    @Test
    public void actionsWithPage() {
        WebPage.openUrl("http://www.baeldung.com/");
        WebPage.getUrl();
        WebPage.getTitle();
        WebPage.back();
        WebPage.forward();
        WebPage.getHtml();
        WebPage.refresh();
    }
}
